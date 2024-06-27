public class MultithreadingMain {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        System.out.println();
        System.out.println("Before Changing the main thread");
        String name=Thread.currentThread().getName();
        System.out.println("The name of the main thread is " + name);
        int P= Thread.currentThread().getPriority();
        System.out.println("The priority of the main thread is " + P);
        System.out.println("************************************************");
        System.out.println("After changing");
        Thread t = Thread.currentThread();
        t.setName("Harshil");
        t.setPriority(1);
        String name1=Thread.currentThread().getName();
        System.out.println("The name of the main thread is " + name1);
        int P1= Thread.currentThread().getPriority();
        System.out.println("The priority of the main thread is " + P1);        
    }
}
