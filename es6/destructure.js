var x = [10,20,30];
var [one,two,three] = x;
console.log(one);
console.log(two);
console.log(three);

var y = ['aravind',10,20];
var [name,n1,n2] = y;
console.log(name);
console.log(n1);
console.log(n2);

// var z = { name: "Aravind", age:20};
// var {name,age} = z;
// console.log(name);
// console.log(age);

var z = { name: "Aravind", age:20};
var {name:myname,age:myage} = z;
console.log(myname);
console.log(myage);

let obj1 = { name: "vickee",age:21};
var { name:fname, age:myage} = obj1;
console.log(fname);
console.log(myage);