class Simple1
{
    constructor(name,age)
    {
        this.name = name;
        this.age= age;
    }
    display()
    {
        console.log("Name: "+ this.name);
        console.log("Age: "+ this.age);
    }
}

let obj = new Simple1("Raj",18);
obj.display();