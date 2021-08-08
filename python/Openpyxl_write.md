#Excel에 내용 쓰기

엑셀파일의 파일명으로 클래스 변수 생성 or 파일명 없이 클래스 변수 생성

클래스 변수에서 시트 이름으로 원하는 시트를 가져오거나 생성

원하는 위치에 데이터 입력 후 저장

from openpyxl import Workbookwb = Workbook()ws = wb.create_sheet('sheet_test2')ws['A1'] = 'insung'ws['B1'] = 'jingny'wb.save('write.xlsx')#저장할 파일 명. wb의 내장함수를 사용하는 것이므로 객체에서 불러오면 안됨.
행 기준으로 데이터 입력하기

from openpyxl import Workbookwb = Workbook()ws = wb.create_sheet('sheet_test3')ws.append(['Number', 'Name']) 
** Number, Name은 column으로 저장됨
append는 '행' 기준으로 데이터를 추가하는 함수
for i in range(10):    ws.append([i+1, str(i+1)+'data'])wb.save('write.xlsx')



# 큰 Excel 파일의 내용 읽기

load_workbook의 문제점
모든 엑셀의 내용을 파이썬으로 한번에 가져옴
- 엑셀 파일이 매우 큰 경우 못 가져오는 경우 발생
- 한 번에 가져오는 과저잉 매우 느림

>> 모든 내용을 한번에 가져오지 않는 방법을 사용

from openpyxl import load_workbookwb = load_workbook('test_data.xlsx', read_only = True)# 읽기 전용 파일이 되는 순간, 내용을 전부 가져오지 않음# Cell이 아닌 ReadOnlyCell 상태로 가져옴# read_only 는 '행' 단위로만 데이터를 읽어옴# >> column 기준으로 데이터 호출시 오류가 생김 >> iter_rows() 활용data = wb.active#print(data['A'])# >> 오류 발생for row in data.iter_rows(max_col=1, max_row=2):    #iter_rows() : 행 단위로 데이터를 가져오는 함수    for cell in row:        print(cell.value)    # 출력값은 튜플로, 각 행의 셀들을 원소로 가짐
