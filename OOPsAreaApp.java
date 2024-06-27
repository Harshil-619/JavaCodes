import java.util.*;

abstract class shape {
    float A;
    abstract public void input();
    abstract public void compute();

    public void disp() {
        System.out.println("The area is : "+ A);
    }
}

 class Rectangle1 extends shape
{
    float l;
    float b;
    public void input ()
    {
        System.out.println("Calculation of rectangle`s area : ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter l of rectangle : ");
        l=scan.nextFloat();
        System.out.println("Please enter b of rectangle : ");
        b=scan.nextFloat();        
    }
    public void compute ()
    {
        A = l*b;
    }
   
}
class Square1 extends shape
{
    float l;
    
    public void input ()
    {
        System.out.println("Calculation of Square`s area : ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter l of Square : ");
        l=scan.nextFloat();
              
    }
    public void compute ()
    {
        A = l*l;
    }
  
}
class Circle1 extends shape
{
    float r;
    
    public void input ()
    {
        System.out.println("Calculation of Circle`s area : ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter r of circle : ");
        r=scan.nextFloat();
        
    }
    public void compute ()
    {
        A = 3.14f * r * r;
    }
   
}
class geometry  {
    public void poly(shape ref) {
        ref.input();
        ref.compute();
        ref.disp();
    }
}

public class OOPsAreaApp {
    public static void main(String[] args) {
        
    
    Rectangle1 rec1 = new Rectangle1();
    Square1 sq1 = new Square1 ();
    Circle1 c1 = new Circle1();

    geometry g = new geometry();
    g.poly (rec1);
    g.poly (sq1);
    g.poly (c1);
    }

    
}
