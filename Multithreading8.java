class ImpMsg implements Runnable { 
    public void run () {
        System.out.println("Display important message");
  
        for (int i =0;i<3;i++)
        { 
            try {
            System.out.println("Education is milk of lioness");
            Thread.sleep(2000);
            }
             catch (Exception e) {
        System.out.println("Thread is interrupted");
        
    }
        }
        System.out.println("Displaying important message task ended");
 
   
}
}

public class Multithreading8 {
    public static void main(String[] args) throws Exception {
        System.out.println("Main thread started");

        ImpMsg m1 = new ImpMsg();
        Thread t1 = new Thread(m1);
        t1.start();
        t1.interrupt();

    }
}


