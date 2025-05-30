class Animal
{
    void display()
    {
        System.out.println("Animals have 4 legs ");
    }
}
class Tiger extends Animal
{

}
class Leapord extends Animal
{
    
}


public class Inheritance4Hierchial {
    public static void main(String[] args) {
        Leapord d3 = new Leapord();
        d3.display();
    }
}



//Java doesnot support Multiple Inheritance. There is diamond problem arises.
// One child can only inherit one parent class at once.

//Single Inheritance
//Multilevel Inheritance
//Hierchial inheritance

class Demo1 //extends object class 
{
    void display()
    {
        System.out.println("Demo1 writtens display method");
    }
}
class Demo2 extends Demo1
{

}
class Demo3 extends Demo2
{

}

//When there is class which is not extend by any other class then 
//that parent class is extended by java`s by default class which is object class.
//we can check it by using inbuilt methods of java on that parent class , 
//that all methods come from Object class itself.