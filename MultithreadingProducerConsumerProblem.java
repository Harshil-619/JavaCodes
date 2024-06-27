class Queue 
{
    int x;
    public void put(int j) 
    {
        x=j;
        System.out.println("I have produced value x " + x);
    }
    public void get ()
    {
        System.out.println("I have consumed value x " + x);
    }
}

class Producer extends Thread 
{
    Queue q;

    Producer(Queue b)
    {
        q=b;
    }

    public void run ()
    {
        int i=1;
        while(true)
        {
            q.put(i++);
        }
    }

}

class Consumer extends Thread
{
    Queue q;

    Consumer(Queue a)
    {
        q=a;
    }

    public void run ()
    {
        while(true)
        {
            q.get();
        }
    }
}

public class MultithreadingProducerConsumerProblem 
{
    public static void main(String[] args) 
    {
        Queue q = new Queue();

        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        p.start();
        c.start();
    }
}