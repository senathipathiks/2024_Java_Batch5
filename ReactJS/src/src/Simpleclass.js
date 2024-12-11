class Simple{
    constructor(name,age){
        this.name=name;
        this.age=age
    }
    disp(){
        console.log("Name is "+this.name);
        console.log("Age is "+this.age);

    }
}

let obj = new Simple("Vashanth",21);
obj.disp();

//Arrow function    vs Traditional Function

function msg(){
    return "Im the normal function"
}



msg1=()=>{
    return console.log("HIII IM Arrow");
}

msg2=()=> "Helooo "
console.log(msg2() + msg1() + msg());


var arr = [1 , 2 , 3];
var [one,two,three]=arr;
console.log(two);

let obj2= {
    name : "Vasi",
    age  : 21,
};
var {  name:myname , age:myage }=obj2;           //Destructuring

console.log(myname);
console.log(obj2.age);

let list = [10,20,30];
let list1 = list.map((val)=>val*2);
console.log(list1);


let l1 = [10,20,30];
let l2 = [40,50,60];     //spread 
let combinedl3= [...l1,...l2];
console.log(combinedl3)
let mini = Math.min(...combinedl3);
console.log(mini);

//rest
let [ten,twenty,thirty,...rest] = combinedl3;
console.log(rest);