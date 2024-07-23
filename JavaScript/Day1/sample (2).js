
// if-else
// var a=20;

// if(a>20){
//     document.write("a is greater than 20");
// }
// else if(a<20){
//     document.write("a is lesser than 20");
// }
// else if(a==20){
//     document.write("a is 20");
// }

// ------------------------

// Global and block level scope
// var a=10;
// {
//     let a=20;
//     document.write(a+" ");
// }
// document.write(a);

//Switch case
// {
//     var a=20;
//     switch(a){
//         case 1: document.write("One");break;
//         case 20: document.write("Twenty");break;
//         case 21: document.write("Twenty One");break;
//     }
// }

// Looping Statements
// For Loop
//         var a=20;
//         for(;a>=0;a--){
//             document.writeln(a);
//         }

// while Loop
// var a=20
// while(a>=0){
//     document.writeln(a--+" ");
// }
// do{
//     document.write("hi"+" ");
//     a--;
// }while(a!=0);


// Functions
// function hello(){
//     return "Hi!!!";
// }
// document.writeln(hello());


//Objects
//Method 1
    // var stud={id:1,name:"Nagarjun",age:21};
    // document.writeln(stud.id);
    // document.writeln(stud.name);
    // document.writeln(stud.age);

//Method 2
    // var stud={
    //     id:1,
    //     name:"Arjun",
    //     age:21
    // }
    // document.writeln(stud.id);
    // document.writeln(stud.name);
    // document.writeln(stud.age);

// var date = new Date();
// document.writeln("Date is "+date.getDate()+" ");
// document.writeln("Day is "+date.getDay()+" ");
// document.writeln("Year is "+date.getFullYear())


//String Manipulation
//String index position starts with 0
        // var str="Hai All";
        // document.writeln(str.charAt(1));
        // document.writeln(str.concat(" Welcome to Relevantz!!!"));
        // document.writeln(str.indexOf('a'))
        // document.writeln(str.lastIndexOf(''));
        // document.writeln(str.startsWith("H"));//Checks caps and small letter also. If same then only it is true, else returns false.
        // document.writeln(str.endsWith("L"));
        // document.writeln(str.toLowerCase());
        // document.writeln(str.toUpperCase());
        // document.writeln(str.substring(1,4));//Starts at 1, endswith n-1. If we don't specify ending index then it will print all the remaining letters.
        // //Substring and subStr are different
        // document.writeln(str.substr(1,4));//starts with index 1,from there it'll have 4 characters.
        // document.writeln(str.slice(1,5));
        // document.writeln(str.trim());//Used to remove the leading and trailing spaces.

//Arrays
// var str=["Nagarjun","Arjun","NS"];
// document.write(str[0]);

//Windows,cookie,history all are browser history objects
//For alert msg, we use windows

function msg(){
    alert("Hello");
}

function verify(){
    var a=document.getElementById("username").value;
    if(a==""){
        alert("Required");
    }
}