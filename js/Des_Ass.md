#비구조화 할당(= 객체 구조 분해)

객체에서 특정 속성들을 추출해내는 것.

ex)

#방법 1. 객체의 속성들 변수화

function print (hero) {

    const { alias, name, actor } = hero;   
    >> hero 객체의 alias, name, actor 속성 변수화
    
    const text = `${alias}(${name}) 역할을 맡은 배우는 ${actor} 입니다`;

    console.log(text);

}


#방법 2. 객체의 속성들을 parameter로 입력받기

function print ( {alias, name, actor} ) {

    const { alias, name, actor } = hero;   
    
    const text = `${alias}(${name}) 역할을 맡은 배우는 ${actor} 입니다`;

    console.log(text);


}

#방법 3. 함수 외부에서 객체속성을 변수화시키기

ex)

 const { name } = ironMan;
console.log(name);
