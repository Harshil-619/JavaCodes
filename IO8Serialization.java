import java.io.*;
import java.util.ArrayList;
import java.util.*;
class Cricketer implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private int runs;

    public Cricketer(String name, int age, int runs)
    {
        this.name= name;
        this.age=age;
        this.runs=runs;
    }
    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }
    public String toString()
    {
        return name + " --> " +age +  " --> " + runs;
    }
}
public class IO8Serialization {
    
    public static void main(String[] args) throws Exception {
        
        // Cricketer c = new Cricketer("Sachin", 49, 10000);

        // System.out.println("Before Serialization : " + c);

        // FileOutputStream fos = new FileOutputStream("D:\\Pw.java\\java\\PW\\pw.txt");
        // BufferedOutputStream bos = new BufferedOutputStream(fos);
        // ObjectOutputStream oos = new ObjectOutputStream(bos);

        // oos.writeObject(c);
        // oos.flush();
        // oos.close();
        
                FileInputStream fis = new FileInputStream("D:\\Pw.java\\java\\PW\\pw.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
       

        Cricketer cr =(Cricketer)ois.readObject();
        cr.disp();

        ois.close();
    }
}
