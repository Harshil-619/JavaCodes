import java.io.*;

public class IO3 {
    public static void main(String[] args) throws Exception {
        File dir = new File("PW");
        File file = new File(dir, "pw.txt");
        // file.createNewFile();
        // // System.out.println(file.isFile());

       // FileWriter fw = new FileWriter(file);
        FileWriter fw = new FileWriter(file, true);
        fw.write("java");
        fw.write("\n");
        fw.write(65);
        fw.write("\n");
        fw.write(97);
        fw.write("\n");
        char ch[] = {'J' , 'A' , 'V' , 'A'};
        fw.write(ch);
        fw.write("\n");
        
       // fw.close();
        fw.flush();

        System.out.println("Open pw.txt to see result");
    }
}
