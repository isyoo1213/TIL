#문자열 내장함수

count : 특정 문자 수를 반환

find : 특정 문자 위치를 반환. 
* 가장 먼저 찾은 위치를 반환

index : 특정 문자 위치를 반환

join : 문자 사이에 입력한 문자를 삽입

b = ','
a = b.join('alghost')
print(a)

>> a,l,g,h,o,s,t

a= b.join ( ['aaaa', 'bbbb', 'cccc'] )
print (a)

>> aaaa, bbbb, cccc

upper : 대문자로 변환한 값 반환

lower : 소문자로 변환한 값 반환

replace : 문자열을 치환한 결과 반환

split : 문자열을 나눈 결과 반환

lstrip : 왼쪽 공백 제가한 값 반환

rstrip : 오른쪽 공백 제거한 값 반환

strip : 양쪽 공백 제거한 값 반환
