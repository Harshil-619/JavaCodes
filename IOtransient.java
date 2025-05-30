import java.io.*;

class Footballers implements Serializable
{
   // private static final long serialVersionUID = 1L;
    private String name;
    private transient int age;
    private int goals;
    

    public Footballers(String name, int age, int goals)
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

public class IOtransient {
    public static void main(String[] args) throws Exception {
        Footballers fbs = new Footballers("Ronaldo", 38, 316);
        
        // fbs.disp();
        // System.out.println(fbs);


        // FileOutputStream fos2 = new FileOutputStream("D:\\Pw.java\\java\\PW\\pw2.txt");
        // BufferedOutputStream bos2 = new BufferedOutputStream(fos2);
        // ObjectOutputStream oos2 = new ObjectOutputStream(bos2);

        // oos2.writeObject(fbs);
        // oos2.flush();
        // oos2.close();

        FileInputStream fis2 = new FileInputStream("D:\\Pw.java\\java\\PW\\pw2.txt");
        BufferedInputStream bis2 = new BufferedInputStream(fis2);
        ObjectInputStream ois2 = new ObjectInputStream(bis2);

        Footballers fbs2 = (Footballers)ois2.readObject();
        fbs2.disp();
        System.out.println(fbs2);
        InputStream
        
        
     }
}
