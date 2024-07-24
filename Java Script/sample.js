document.writeln("<h2>Hello this is my external<h2>");

// let and var
var a=10;
document.writeln(a);

var b=20;{
    let b=30;
    document.writeln(b);
}
document.writeln(b +"<br>");
document.write("<br>")

//switch
switch(a){
    case 10: document.writeln("ten"+"<br>");
            break;
    case 2: document.writeln("two");
            break;
    case 3: document.writeln("three");
            break;
}
document.write("<br>")

//for
for(var i=0;i<10;i++){
    document.writeln(i+"<br>")
    
}
document.write("<br>")

//double and triple equal
document.write(a==10)
document.write("<br>")
document.write(a==='10');
document.write("<br>")
document.write("<br>")

//function
function sayHello(){
    return "hello";
}
document.write("This is my Function  : "+sayHello()+"<br>");
document.write("<br>")

//object
var stud={
    studid:12,
    studName:"Arun",
    studAge:21
}
document.write(stud.studid+"<br>");
document.write(stud.studName+"<br>");
document.write(stud.studAge+"<br>");
document.write("<br>")

// object2
var stud1=new Object();
stud1.studid=1,
stud1.studName="Velan",
stud1.studAge=21
document.write(stud1.studid+"<br>");
document.write(stud1.studName+"<br>");
document.write(stud1.studAge+"<br>");
document.write("<br>")

//Date inbuilt object
var date=new Date();
document.write(date.getDate()+"<br>");
document.write(date.getFullYear()+"<br>");
document.write(date.getDay()+"<br>");
document.write(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds()+"<br>");
document.write(date+"<br>")
document.write("<br>")

//String manipulation
var str="Hai All";
document.write(str.charAt(1)+"<br>")
document.write(str.concat(" Welcome to relevantz")+"<br>")
document.write(str.indexOf('a')+"<br>")
document.write(str.lastIndexOf('l')+"<br>")
document.write(str.startsWith("H")+"<br>")
document.write(str.endsWith("H")+"<br>")
document.write(str.length+"<br>")
document.write(str.toUpperCase()+"<br>")
document.write(str.toLowerCase()+"<br>")
document.write(str.substring(1,4)+"<br>")
document.write(str.substr(1,4)+"<br>")
document.write(str.slice(1,4)+"<br>")
document.write(str.trim()+"<br>") // remove white space
document.write("<br>")

// Array
var string=["Velan","vicky","ani"]
document.writeln(string[0])

//alert

function msg(){
    var m=document.getElementById("uname").value
    alert("Hello "+m);
}

//onblur
function verify(){  
    var m=document.getElementById("uname").value
    if(m==""){
        alert("Required")
    }

}


