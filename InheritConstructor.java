class Demo1 
{
    int a,b;
    public Demo1() 
    {
        System.out.println("Parent class Constructor");
    }
    public Demo1(int x,int y)
    {
        System.out.println("Parameterized parent class constructor");
        a=x;
        b=y;
    }
}
class Demo2 extends Demo1 
{
    int m,n;
    public Demo2()
    {
         //super(); By default
        this(10 , 20);
        System.out.println("Child class constructor");
    }
    public Demo2 (int x, int y) 
    {
        System.out.println("Parameterized Child class Constructor");
        m=x;
        n=y;
    }
}

public class InheritConstructor {
    public static void main(String[] args) 
    {
        Demo2 d = new Demo2();
       // Demo2 d2 = new Demo(10,20);
    }
}
