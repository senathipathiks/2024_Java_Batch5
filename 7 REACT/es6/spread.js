//spread operation
let arr = [1,3,53,75,24,75,13,68,64];
 arr = arr.map((i)=>i*2);
let maxi = Math.max(...arr);
let mini = Math.min(...arr);
console.log(mini);
console.log(maxi);

console.log();

function sum(...args) {
    let sum = 0;
    for (let arg of args) sum += arg;
    return sum;
  }

let x = sum(4, 9, 16, 25, 29, 100, 66, 77);
console.log(x);

console.log();


//Rest operation

let num = [4, 9, 16, 25, 29, 100, 66, 77];
let [one,two,...three] = num;
console.log(one);
console.log(three);