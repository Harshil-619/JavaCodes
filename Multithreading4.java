import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
class Calc extends Thread {
    public void run () {
               
        System.out.println("Calculation task started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first number");
        int num1 = sc.nextInt();
        System.out.println("Please enter your second number");
        int num2 = sc.nextInt();

        int res = num1+num2;
        System.out.println("your result of num1+num2 is " + res);
        System.out.println("Calculation task ended");
        System.out.println("*****************************");

    }
}

class Message extends Thread {
    public void run () {
        System.out.println("Display important message");
    try {
        for (int i =0;i<3;i++)
        {
            System.out.println("Education is milk of lioness");
            Thread.sleep(2000);
        }
        System.out.println("Displaying important message task ended");
    }
    catch (Exception e) {
        System.out.println("Some problem");
        
    }
}
}

public class Multithreading4 {
    public static void main(String[] args) {
        Calc t1 = new Calc();
        Message t2 = new Message ();

        t1.start();
        t2.start();
    }
}
