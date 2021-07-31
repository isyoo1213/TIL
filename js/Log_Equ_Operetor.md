#논리 연산자의 순서
! > && > ||

ex) const value = !(ture && false || true && false || !false);

1. ! 연산

!(true && false || true && false || true)

2. and 연산

!(false || false || true)

3. || 연산
!(true)

최종적으로 false



#이퀄 연산자

== : type을 검사하지 않음
* null과 undefined를 같은 것으로 인식
=== : 개발할 땐 이퀄 3개를 사용하자!
