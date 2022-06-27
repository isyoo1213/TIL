// 배열에 스프레드 연산자 사용
const numbers = [1, 2, 3];
const newNumbers = [...numbers, 4, 5];

console.log(newNumbers);
console.dir(newNumbers);

// 객체에 스프레드 연산자 사용
const person = {
    name: 'insung'
};

const newPerson = {
    ...person,
    age: 32
}

console.log(newPerson);