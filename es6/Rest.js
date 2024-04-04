function add(...arr1){ //rest operator -> grouping element(function definition)
    var sum = 0;
    arr1.forEach(element => { sum += element}) ;
    return sum;
}

let a = [10,20,30];
let val = add(...a); //spread operator -> individual element (function call)
console.log(val);


var arr = [10,20,30,40,60];
var[one,two,...three] = arr; //rest operator -> grouping
console.log(three);