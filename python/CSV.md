#CSV

comma-separated values
', '와 개행 문자로 구분된 파일
엑셀과 유사한 형태로 읽고 쓸 수 있다
', '로 컬럼을 구분하고 개행 문자로 행을 구분한다

datafile = open('data.csv', 'r')for line in datafile.readlines():    data = line.strip().split(',') # data는 리스트    print(data[0])    print(data[1])    print(data[2])    print('-' * 20)



datafile.readlines()

출력해보면 리스트형태. ** 행 단위로 쪼개서 가져옴

print(datafile.readlines())


['data1-1,data1-2,data1-3\n', 'data2-1,data2-2,data2-3\n', 'data3-1,data3-2,data3-3']

개행이 포함되기 때문에 line 불러올 때 strip() 사용

values = []values.append(('insung', 'fastone'))values.append(('jingny', 'babo'))values.append(('mom', 'old'))datafile = open('result.csv', 'w')for line in values :    data = ','.join(line)    datafile.write(data+'\n')datafile.close()


#join 

** '문자열'이 가지고 있는 내장함수
문자, 리스트, 튜플을 입력값으로 받아 원소들을 '문자열'로 반환.
각각의 원소 사이사이에 특정 문자열 삽입 가능
