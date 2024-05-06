class Sample {
    // var age;
    // var name;
    constructor(name, age) {
        this.age = age;
        this.name = name;
    }
    display(){
        console.log(this.name);
        console.log(this.age);
    }

    msg = ()=>{ return "hey bro"} //arrow function to use in anonymous function
    msg2 = ()=>"Dei bro " // simplified arrow function for one line prog & single return

}

var obj1 = new Sample("Jeeva",19);
obj1.display();
console.log(obj1.msg());
console.log(obj1.msg2());