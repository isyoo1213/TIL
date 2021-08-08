#openpyxl 레퍼런스
https://openpyxl.readthedocs.io

#패키지 설치가 성공적으로 이루어졌는지 살펴보는 간단한 방법
터미널에서 python >>> import Pac_name



#Excel 내용 읽기

프로그램이 데이터를 확인하는 과정

파일 > 시트 > 위치

데이터가 들어있는 파일명으로 클래스 변수 생성
클래스 변수에서 시트이름으로 원하는 시트를 가져오기
데이터가 있는 위치의 데이터를 확인

from openpyxl import load_workbookad = load_workbook('simpledata.xlsx')data = ad.activeprint(data['A1'].value)print(data['A2'].value)print(data['B1'].value)print(data['B2'].value)

load_workbook('file_name')

>> file_name의 모든 내용을 불러와 클래스 변수로 반환

wb.active 
>> 클래스 변수 내에 변수에 접근
>> 시트를 선택하는 과정. 
active - 주로 마지막으로 본 시트가 저장 됨. 가장 마지막으로 활성화된 시트.

* indexing 사용 가능
- 엑셀의 데이터는 Dictionary 형태로 저장되어있음.

data[ 'A1' ]  >> 셀 클래스 변수. 셀을 나타내는 클래스 변수
* 실제로는 셀에 포인트, 폰트, 배경, 뭐 뭐 여러가지 요소들이 있음.
.value >> 여러 요소 중 값 변수에 접근


#영역으로 지정해 가져오기

열과 행을 같이 가져오기

from openpyxl import load_workbookwb = load_workbook('simpledata.xlsx')dataa = wb.activerow = dataa['2']print(row) # 튜플 자료형으로 cell 클래스를 반환for cell in row:    print(cell.value)print('-' * 20)col = dataa['A']print(col) # 튜플 자료형으로 cell 클래스를 반환for cell in col:    print(cell.value)


#Sheet 선택해서 불러오기

from openpyxl import load_workbookwb = load_workbook('simpledata.xlsx')data = wb['Sheet_test']

data에 담아줄 때 indexing으로 해당 시트만 선택

data = wb[ 'sheet_name' ]area = data['A1:B2']
'
print (area)로 확인해보면
((<Cell 'Sheet_test'.A1>, <Cell 'Sheet_test'.B1>), (<Cell 'Sheet_test'.A2>, <Cell 'Sheet_test'.B2>))

>> 튜플 안에 튜플.  '행' 기준으로 같은 행 내의 클래스 변수들이 튜플로 묶임
for row in area:    for cell in row:        print(cell.value)print('-'*20)rows = data['1:2']for row in rows:    for cell in row:        print(cell.value)print('-'*20)cols = data['A:B']for col in cols:    for cell in col:        print(cell.value)print('-'*20)
