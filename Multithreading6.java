import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
class MyThread1 extends Thread {
    public void run() {
        String tName =Thread.currentThread().getName();
        if(tName.equals("CALC")) {
            calc();
        }
        else {
            impMsg();
        }
    }
    public void calc () {
               
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


public void impMsg () {
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

public class Multithreading6 {
    public static void main(String[] args) {
        System.out.println("Main thread started");

        MyThread1 thread1 = new MyThread1();
        MyThread1 thread2 = new MyThread1();

        thread1.setName("CALC");
        thread2.setName("MSG");

        thread1.start();
        thread2.start();
    }
}

