import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
class Calc implements Runnable {
    public void run () {
               
        System.out.println("Calculation task started");
        Scanner sc = new Scanner(System.in);
        try {
        System.out.println("Please enter your first number");
        int num1 = sc.nextInt();
        Thread.sleep(2000);
        System.out.println("Please enter your second number");
        int num2 = sc.nextInt();
        Thread.sleep(2000);
        int res = num1+num2;
        System.out.println("your result of num1+num2 is " + res);
        System.out.println("Calculation task ended");
        System.out.println("*****************************");
        }
        catch (Exception e) {
        System.out.println("Some problem");
        
    }
    }

}

class Message implements Runnable {
    public void run () {
        System.out.println("Display important message");
   
        for (int i =0;i<3;i++)
        {
            System.out.println("Education is milk of lioness");
            
        }
        System.out.println("Displaying important message task ended");
    
    
}
}

public class Multithreading5 {
    public static void main(String[] args) {
        Calc c1 = new Calc();
        Message m2 = new Message ();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(m2);

        t1.start();
        t2.start();
    }
}

