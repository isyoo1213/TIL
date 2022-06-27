// 배열 디스트럭쳐링
const numbersArray = [1, 2, 3];
[num1, num2] = numbersArray;
[num1, , num3] = numbersArray;
console.log(num1, num2);
console.log(num1, num2, num3);

//객체 디스트럭쳐링
const {name} = {name:'insung', age:32}
console.log(name);
// console.log(age);