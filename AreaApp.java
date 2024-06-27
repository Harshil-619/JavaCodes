import java.util.Scanner;

class Rectangle
{
    float l;
    float b;
    float A;
    
    void input ()
    {
        System.out.println("Calculation of rectangle`s area : ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter l of rectangle : ");
        l=scan.nextFloat();
        System.out.println("Please enter b of rectangle : ");
        b=scan.nextFloat();        
    }
    void compute ()
    {
        A = l*b;
    }
    void disp ()
    {
        System.out.println("Your area of rectangle of : " + A);
    }
}
class Square
{
    float l;
    float A;
    
    void input ()
    {
        System.out.println("Calculation of Square`s area : ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter l of Square : ");
        l=scan.nextFloat();
              
    }
    void compute ()
    {
        A = l*l;
    }
    void disp ()
    {
        System.out.println("Your area of Square of : " + A);
    }
}
class Circle
{
    float r;
    double A;
    
    void input ()
    {
        System.out.println("Calculation of Circle`s area : ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter r of circle : ");
        r=scan.nextFloat();
        
    }
    void compute ()
    {
        A = 3.14 * r * r;
    }
    void disp ()
    {
        System.out.println("Your area of Circle of : " + A);
    }
}

public class AreaApp {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.input();
        rec.compute();
        rec.disp();
        Square sq = new Square();
        sq.input();
        sq.compute();
        sq.disp();
        Circle c = new Circle ();
        c.input();
        c.compute();
        c.disp();        
    }
    
}
