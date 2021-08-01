#for..of 
주로 배열을 반복할 때 사용하는 반복문

for ( let number of numbers ) {

    console.log ( number ) ; 

}

#배열 내 전체 원소들의 구성을 살펴보는 방법

console.log ( Object.entries ( 객체이름 ) ) ;

#배열 내 key/value들을 받아오는 방법

console.log ( Object.keys ( 객체이름 ) ) ;
console.log ( Object.values ( 객체이름 ) ) ;




#for ... in

for ( let key in doggy ) {

    console.log ( `&{key} : &{doggy[key]}` ) ;
