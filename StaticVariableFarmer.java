import java .util.Scanner;
class Farmer
{
    int pa;
    float td;
    static float ri;
    float si;

    static {
        ri = 8.5f;
    }

    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter principal amount");
        pa = scan.nextInt();

        System.out.println("Please enter time duration");
        td = scan.nextFloat();
    }

    void compute () {
        si = pa*ri*td/100f;
    }

    void display() {
        System.out.println("Your simple interest will be: " + si);
    }
}

public class StaticVariableFarmer {
    public static void main(String[] args) {
        Farmer f = new Farmer();
        f.input();
        f.compute();
        f.display();
        Farmer f2 = new Farmer();
        f2.input();
        f2.compute();
        f2.display();
    }
}
