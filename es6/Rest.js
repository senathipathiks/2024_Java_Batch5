//Rest Operator
function add(...arr1)
{
    var sum = 0;
    arr1.forEach(element => {
        sum += element;
    });
    return sum;
}
//Spread Operator
let arr = [10,20,30,40,50];
let val = add(...arr);
console.log(val);
//Rest Operator
var arr1= [10,20,30];
var[one,...two]=arr1;
console.log(two);