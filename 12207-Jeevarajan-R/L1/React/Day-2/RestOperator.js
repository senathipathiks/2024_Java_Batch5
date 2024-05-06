let a = [10,20,30,40,50]
var [b,c,...d] = a;
// console.log(d);


function add(a,b,...c){
    var sum = 0;

    for(let i in c){
        sum+=i;
    }    
    return sum
}

let val = add(10,20,30,40,50);
console.log(val);