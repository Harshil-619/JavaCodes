class Demo1 
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

public class Inheritance3Multilevel {
    public static void main(String[] args) {
        Demo3 d3 = new Demo3();
        d3.display();
    }
  
}
