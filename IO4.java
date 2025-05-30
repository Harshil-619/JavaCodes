import java.io.*;

public class IO4 {
    public static void main(String[] args) throws Exception {
        File dir = new File("PW");
        File file = new File (dir, "pw.txt");

        FileReader fr = new FileReader(file);
        int i=fr.read();
        //System.out.println((char)i);

        while (i!= -1)
        {
            System.out.print(i + "---->");
            System.out.println((char)i);
            i=fr.read();
        }

    }
}
