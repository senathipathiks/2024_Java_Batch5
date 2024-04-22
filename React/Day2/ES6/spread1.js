// function add(...arr1){   //rest operator- It'll be in fucntion definition
//     var sum=0;
//     arr1.forEach(element => {
//         sum += element;
//     })
// // arr1.map((element)=>sum+=element);
//     return sum;
// }

// let arr = [1,2,3];
// let val = add(...arr);
// console.log(val);

var arr = [1,2,3,4];    
var [one,two,...three]=arr;         //Spread Operator - Its in the function call
console.log(three);