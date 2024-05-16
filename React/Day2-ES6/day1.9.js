function add(...arr1) //rest operatoer
{
    var sum=0;
    arr1.forEach(element =>{
        sum+=element;
    });
    return sum;
}
let arr=[10,20,30];
let val=add(...arr); //spread operator
console.log(val);