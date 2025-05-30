import java.io.*;

class Footballer0 implements Serializable
{
   // private static final long serialVersionUID = 1L;
    private String name;
    private transient int age;
    private int goals;

    public Footballer0(String name, int age, int goals)
    {
        this.name= name;
        this.age=age;
        this.goals=goals;
    }
    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(goals);
    }
    public String toString()
    {
        return name + " --> " +age +  " --> " + goals;
    }
}

public class IO9 {
    public static void main(String[] args) throws Exception {
        // Footballer0 fb = new Footballer0("Ronaldo", 38, 316);
        // System.out.println(fb);

        // FileOutputStream fos = new FileOutputStream("D:\\Pw.java\\java\\PW\\pw.txt");
        // BufferedOutputStream bos = new BufferedOutputStream(fos);
        // ObjectOutputStream oos = new ObjectOutputStream(bos);

        // oos.writeObject(fb);
        // oos.flush();
        // oos.close();

        FileInputStream fis = new FileInputStream("pw.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Footballer2 fb2 = (Footballer2)ois.readObject();
        fb2.disp();
        System.out.println(fb2);
        
        
    }
}
