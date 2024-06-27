class ImpMsg implements Runnable { 
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

public class Multithreading7 {
    public static void main(String[] args) throws Exception {
        System.out.println("Main thread started");

        ImpMsg m1 = new ImpMsg();
        Thread t1 = new Thread(m1);
        System.out.println(t1.isAlive()); //false
        t1.start();
        System.out.println(t1.isAlive()); //true
        t1.join();
        System.out.println("Main thread finished");
    }
}

