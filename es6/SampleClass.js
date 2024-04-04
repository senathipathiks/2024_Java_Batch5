class SampleClass{
    constructor(name,age)
    {
        this.name=name;
        this.age=age;
    }
    display(){
        console.log("Name: " +this.name);
        console.log("Age: "+this.age);
    }
} 

class SampleClass1{
    constructor(name,college)
    {
        this.name=name;
        this.col=college;
    }
    display(){
        console.log("Name: " +this.name);
        console.log("college: "+this.col);
    }
}

let obj1 = new SampleClass("Aravind",20);
let obj2 = new SampleClass("vickee",21);
obj1.display();
obj2.display();

let obj3 = new SampleClass1("Aravind","psna");
let obj4 = new SampleClass1("vickee","kcet");
obj3.display();
obj4.display();