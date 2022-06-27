const filter = (...args) => {
    return args.filter(el => el === 1);
    // filter() 내부는 arrow function 자체로 레스트와는 상관이 없음
    //'==='는 타입과 값이 같은지 모두 검사
}

console.log(filter(1, 2, 3));