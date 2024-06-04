//Class feature in es6
class Simple1
{
    constructor(name,age)
    {
        this.name=name;
        this.age=age;
    }
    display(){
        console.log("Name: " + this.name);
        console.log("Age: " + this.age);
    }
}
let obj1 = new Simple1("Ganapathy",21);
obj1.display();