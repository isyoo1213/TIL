email발송 원리

필요한 설정 정보

SMTP 서버 주소 : 메일 보내는 서버 주소
POP 서버 주소 : 메일 받는 서버 주소
SMTP 서버 포트 : SMTP주소로 갈 때 쓸 길 번호
POP 서버 포트 : POP 주소로 갈 때 쓸 길 번호
계정 정보 : id, password

즉, 서버가 원하는 형태의 모습으로 데이터를 가공
>> SMTP 서버에 로그인
>> SMTP 서버로 데이터 전송


6 - 27 ~ 28 Text Email 보내기

from email.mime.text import MIMETextfrom email.mime.multipart import MIMEMultipart# 이 둘은 SMTP형식에 맞게 데이터를 가공import smtplib # 실제로 smtp에 접속하고 처리하는 역할## 위 세가지는 파이썬 기본 패키지. pip를 통해 설치하는 것 아님.SMTP_SERVER = 'smtp.gmail.com'SMTP_PORT = 465SMTP_USER = 'moethns@gmail.com'SMTP_PASSWORD = ''def send_mail(name, addr, subject, contents):    msg = MIMEMultipart('alternative')    # alternative는 smtp의 형태에 맞게 text내용을 담은 mail임을 명시하는 역할    msg['From'] = SMTP_USER    msg['To'] = addr    msg['Subject'] = name + '님, ' + subject    text = MIMEText(contents, _charset='utf-8')    # text에 MIMEText로 만든 클래스 변수를 넣어줌    # charset - 문자열을 표현하는 방식.    msg.attach(text)    # text메일이라해도, 내용에는 이미지나 첨부파일들이 들어갈 수 있음.    # >> attach를 통해 내용을 계속 덧붙여 나감.    # smtp형식으로 데이터 가공 끝    smtp = smtplib.SMTP_SSL(SMTP_SERVER, SMTP_PORT)    # 서버에 접속하기 위한 정보    smtp.login(SMTP_USER, SMTP_PASSWORD)    smtp.sendmail(SMTP_USER, addr, msg.as_string())    smtp.close()contents = '''안녕하세요.자동화로 보내지는 메일입니다. '''send_mail('유인성', 'isyoo1213@naver.com', '자동화메일입니다.', contents)





6 - 29 Email address유효성 검사

정규표현식
문자열을 표현할 때, 패턴으로 표현하는 것. ex) 메일 주소

import re 
: Regular Expression의 약자.

if not re.match('(^[a-zA-Z0-9_.-]+@[a-zA-Z0-9,-]+\.[a-zA-Z0-9-.]+$)', addr):# 꺽쇠는 문자열의 시작을 알림# 문자열이므로 대괄호.# a : 소문자 / zA : 대문자 >> 모든 알파벳# 0-9 숫자, _.- : 문자 그대로의 문자(특수문자?)# + : 앞의 대괄호의 문자가 한 개 이상# 정리 >> []의 문자로 시작을 하고 / 1개 이상이고 / @가 나와야함# .(dot)은 정규표현식에서 아무 문자 하나. >> escape code로 표현    print('Wrong mail!')    return



6 - 29 첨부파일 추가하기

from email.mime.text import MIMETextfrom email.mime.multipart import MIMEMultipart# 이 둘은 SMTP형식에 맞게 데이터를 가공import smtplib # 실제로 smtp에 접속하고 처리하는 역할## 위 세가지는 파이썬 기본 패키지. pip를 통해 설치하는 것 아님.import re# Regular Expression의 약자. 파이썬 기본 패키지.SMTP_SERVER = 'smtp.gmail.com'SMTP_PORT = 465SMTP_USER = 'moethns@gmail.com'SMTP_PASSWORD = ''def send_mail(name, addr, subject, contents, attachment=None):    if not re.match('(^[a-zA-Z0-9_.-]+@[a-zA-Z0-9,-]+\.[a-zA-Z0-9-.]+$)', addr):    # 꺽쇠는 문자열의 시작을 알림    # 문자열이므로 대괄호.    # a : 소문자 / zA : 대문자 >> 모든 알파벳    # 0-9 숫자, _.- : 문자 그대로의 문자(특수문자?)    # + : 앞의 대괄호의 문자가 한 개 이상    # 정리 >> []의 문자로 시작을 하고 / 1개 이상이고 / @가 나와야함    # .(dot)은 정규표현식에서 아무 문자 하나. >> escape code로 표현        print('Wrong mail!')        return    # 첫 parameter - pattern    # attatchment는 파일의 '경로'가 들어옴 **    # None : parameter의 기본값 지정. 아무것도 없다. 거짓이다 라고 이해하면 편함.    msg = MIMEMultipart('alternative')    # alternative는 smtp의 형태에 맞게 text내용을 담은 mail임을 명시하는 역할    if attachment:        msg = MIMEMultipart('mixed')        # text뿐만 아니라, 어떠한 파일도 가지고 있을 경우.        # 처음부터 mixed로 사용하면 첨부파일 표시가 불가.    msg['From'] = SMTP_USER    msg['To'] = addr    msg['Subject'] = name + '님, ' + subject    text = MIMEText(contents, _charset='utf-8')    # text에 MIMEText로 만든 클래스 변수를 넣어줌    # charset - 문자열을 표현하는 방식.    msg.attach(text)    # text메일이라해도, 내용에는 이미지나 첨부파일들이 들어갈 수 있음.    # >> attach를 통해 내용을 계속 덧붙여 나감.    if attachment :        from email.mime.base import MIMEBase        from email import encoders        # MIMEBase는 대부분의 내용을 담는 기본 베이스 형태        # encoders : 파일 전송에 필요한 기준으로 변환        file_data = MIMEBase('application', 'octect-stream')        # parameter는 타일이라고 부름. 첨부하고자 하는 파일의 종류.        # 위 두개는 일반 파일이라고 생각하면 편함.        file_data.set_payload(open(attachment, 'rb').read())        #set_payload() : 내용을 채워넣을 때 사용하는 함수.        # rb : r - 읽을 때. rb - 2진법으로 읽겠다.        # read() 채워넣은 내용을 읽어서 나온 전체 내용을 반환.        # but read()함수는 용량 엄청 클수도.        encoders.encode_base64(file_data)        # smtp에서 파일을 보낼때 전송하는 방식으로 변환        import os        # attachment = 'test.txt' >> metadata?? 첨부파일 이름 표시해줌.        # attachment는 경로를 나타냄! 경로 내에서 파일명을 찾아내야함. >> os 패키지        filename = os.path.basename(attachment)        # os라는 패키지에서 해당경로의 파일네임을 가져오는 함수        file_data.add_header('Content-Disposition', 'attachment; filename="'+filename+'"')        # header : file_data가 실제 표현되기 전에 data에 대한 data, meta data 정보를 추가.        # parameter는 key와 value 형식?        msg.attach(file_data)    # smtp형식으로 데이터 가공 끝    smtp = smtplib.SMTP_SSL(SMTP_SERVER, SMTP_PORT)    # 서버에 접속하기 위한 정보    smtp.login(SMTP_USER, SMTP_PASSWORD)    smtp.sendmail(SMTP_USER, addr, msg.as_string())    smtp.close()contents = '''안녕하세요.자동화로 보내지는 메일입니다. '''send_mail('유인성', 'isyoo1213@naver.com', '자동화메일입니다.', contents, 'test.txt')
