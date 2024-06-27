import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class waaste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scan.nextInt();
        System.out.println("Your age is " + age);

        System.out.println("Enter you name");
        String name = scan.nextLine();
        System.out.println("Your name is " + name);

        System.out.println("Enter your CGPA");
        double CGPA = scan.nextDouble();
        System.out.println("Your CGPA of Btech in IT is " + CGPA);
    }
}

