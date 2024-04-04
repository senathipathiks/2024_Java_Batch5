function sum(...arr){  //rest operator
    var sum = 0;
    arr.forEach(element => {
        sum+=element;
    });
    return sum;
}

let arr = [12,24,36];
let res = sum(...arr); //Spread Operator
console.log(res);

// var arr = [10,20,30,40];
// var[one,two,...three] = arr;
// console.log(three);