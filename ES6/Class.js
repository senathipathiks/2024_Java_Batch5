class Sample
{
    constructor(name, age)
    {
        this.name = name;
        this.age = age;
    }
    display()
    {
        console.log("Name :" + this.name);
        console.log("Age :" + this.age);
    }
}
let obj1 = new Sample("Gokul", 20);
obj1.display();