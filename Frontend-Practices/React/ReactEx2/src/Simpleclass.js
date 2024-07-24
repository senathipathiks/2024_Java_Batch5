// class Simpleclass{

//     constructor(name,age){

//         this.name = name;
//         this.age = age;

//     }

//     display(){

//         console.log("Name: "+this.name);
//         console.log("Age: "+this.age);
        

//     }
// }

// let obj = new Simpleclass("Nandhakumaran", 20);
// obj.display();
// document.write(obj.name);
// document.write(obj.age);

// msg=() =>{return "Hello"}
// msg=()=>"Hello"

// console.log(msg());

// sum=(num1,num2)=>{return num1+num2;}

// console.log(sum(2,3));

// var x = [10,20,30];
// var [one,two,three] = x;
// console.log(one);
// console.log(two);
// console.log(three);

// calculate = (a,b) => {

//     var add = a+b;
//     var sub = a-b;
//     var mul = a*b;
//     var div = a/b;
//     var mod = a%b;

//     return[add,sub,mul,div,mod];
// }

// var [add,sub,mul,div,mod] = calculate(2,3);
// console.log(add);
// console.log(sub);
// console.log(mul);
// console.log(div);
// console.log(mod);


// var object ={

//     name:'Nandhakumaran H',age:20
// };

// var {name:myname,age:myage} = object;
// console.log(myname);
// console.log(myage);

// var myarray = [1,2,3];
// var array1 = myarray.map((a)=>a*2);
// console.log(array1);

// let arr = [100,200,300,400,500,600];
// let arr2 = [1,2,3]; 
// let combine = [...arr,...arr2]
// let mini = Math.min(...arr);
// let mini1 = Math.min(...combine);
// console.log(mini);
// console.log(mini1);

// let [one, two, ...rest] = arr;
// let [a, b, ...c] = combine;

// console.log(combine);

// console.log(one);
// console.log(two);
// console.log(rest);

// console.log(a);
// console.log(b);
// console.log(c);



    // let ab = 10;
    // let ab = 'jeeva';

    // var int = 10;
    // var int = 'jeeva';

    // console.log(int);


function add(one,two,three){
    
    var sum=0;
    
    return one+two+three;
}


let arr=[1,2,3];
let val = add(...arr);
// let val=add(1,2,3);
console.log(val);



