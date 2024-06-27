class Demo {
    static int a;
    static int b;

    int m;
    int n;

    static {
        a= 10;
        b=20;
        System.out.println("Control in static block");
    }

    {
        m=100;
        n=200;
        System.out.println("Control in non startic block");
    }

    static void disp1 (){
        System.out.println("Value of static var: " + a);
        System.out.println("Value of static var: " + b);
    }

    void disp2 () {
        System.out.println("Value of instance var: " + a);
        System.out.println("Value of instance var: " + b);
    }
}


public class StaticEg {
public static void main(String[] args) {
    Demo.disp1();
    Demo d = new Demo();
    d.disp2();
}    
}
