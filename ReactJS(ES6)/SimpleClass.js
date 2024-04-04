class Simple{
    constructor(name,age){
        this.name=name;
        this.age=age;
    }
    display(){
        console.log("Name: "+this.name);
        console.log("Age: "+this.age);
    }
}
class simple1{
    constructor(name,city){
        this.name=name;
        this.city=city;
    }
    display(){
        console.log("Name: "+this.name);
        console.log("City: "+this.city);
    }
}
let obj1 = new Simple("vicky",22);
let obj2 = new Simple("Java",100);
obj1.display();
obj2.display();
let var1 = new simple1("aravind","Dindigul");
let var2 = new simple1("velan","Nelakottai");
var1.display();
var2.display();