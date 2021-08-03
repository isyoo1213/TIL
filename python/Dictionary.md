#Dictionary
대응 관계를 나타낼 수 있는 자료형
key와 value의 쌍으로 여러 데이터를 표현할 떄 사용

#indexing 은 지원 
- key로 가능  >> 인덱스가 아닌 문자열 사용 가능하므로 인지가 쉬움

#slicing은 지원하지 않음! 
- **요소들이 '순서'의 개념이 아님.

#indexing으로 삭제 가능
a = {'name' : 'insung', 'age' : 31}
del ( a[ 'name' ] )
print (a)
>> { 'age' : 30 }


#dictionary 내장 함수

- keys : 딕셔너리의 key들을 반환

* 클래스 형태로 반환
dict_keys{ [ ] }

- values : 딕셔너리의 value들을 반환

dict_values { [ ] }


- items: key와 vlue의 쌍을 반환

 * 클래스 형태로 반환하나, list 내에 key, value를 가진 tuple로 반환
 
dic_items{ [ ( ) ]  }


- get : key에 대한 값을 반환 
 * 값이 없는 경우, 기본값 지정이 가능
 >> indexing을 통해 키에 대한 값을 가져올 때, 원하는 key 값이 없으면 에러.
 >> 에러가 나지 않고 '기본값 지정'으로 

a { 'a' : 123, 'b' : 456}
result = a.get ( 'c' , 789)

>> c라는 key에 대한 value를 탐색하되, 없으면 789라는 기본값을 반환


# del 사용도 가능
del( a ['a'] ) 
print (a)

>> { 'b' : 456 }

indexing을 통해 새로운 값 추가 가능

a[ 'c' ] = 100

print (a)

기존에 있는 key에 indexing을 통해 값을 할당하면 value가 수정됨
