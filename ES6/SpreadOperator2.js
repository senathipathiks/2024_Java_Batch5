function add(one, two, three)
{
    var sum = 0;
    arr.forEach(element => {
        sum += element;
    });
    return one + two + three;
}

let arr = [10, 20, 30];
let val = add(20,...arr);
console.log(val);