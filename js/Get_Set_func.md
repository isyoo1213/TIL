#getter 함수
객체 속성을 조회할 때 함수가 실행되도록 설정.
getter함수에서 연산한 값을 반환

get 함수이름 (  ) {  

    return this.a + this.b

}

console.log(numbers.sum);  
>>>> 객체속성 조회만 하더라도 getter함수의 반환값 반환


#setter함수

set name ( value ) {  * parameter 필수적으로 설정 필요

    this._name = value;

}

******
#setter함수와 getter함수는 이름이 같을 수 있다.
그러나 호출 방법이 다름
getter 함수 - 조회시 호출 가능
setter 함수 - 값을 할당해줄 때 호출
