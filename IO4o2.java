import java.io.*;

public class IO4o2 {
    public static void main(String[] args) throws Exception {
        File dir = new File("PW");
        File file = new File(dir, "pw.txt");

        char ch[] = new char[(int)file.length()];

        FileReader fd = new FileReader(file);
        fd.read(ch);

        for (char data : ch)
        {
            System.out.print(data);
        }
        
    }
}
