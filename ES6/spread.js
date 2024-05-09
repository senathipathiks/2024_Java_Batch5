function add(one,two,three,four) //REST operator
{
    var sum=0;
    // arr1.forEach(element => {
    //     sum+=element;
    // });
    return one+two+three+four;
}

let arr=[10,20,30];
let val=add(...arr);  //Spread operator
console.log(val);