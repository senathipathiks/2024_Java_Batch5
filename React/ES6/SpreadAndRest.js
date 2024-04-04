function add(...arr1){  //Rest Operator
    let sum = 0;
    arr1.forEach(element => {
        sum += element;
    });

    return sum;
}


let arr = [1, 2, 3]
let mini = Math.min(...arr);
console.log(mini);

let addition = add(...arr); //Spread Operator
console.log(addition);

let a = [1,2,3,4];
var[one, two, ...three] = a;  // Rest Operator
console.log(three);