function add(one,two,three)
{
    var sum=0;
    return one+two+three;
}
let arr=[10,20,30];
let val=add(...arr);
console.log(val);