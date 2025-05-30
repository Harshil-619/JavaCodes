import java.io.*;
public class IO7 {
    public static void main(String[] args) throws Exception {
        
        File dir = new File("PW");
        File file = new File(dir, "pw.txt");

        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);

        pw.write(97);
        pw.write("\n");

        pw.println("java");
        pw.print(100);
        pw.println ('a');
        pw.println(52.5);
        pw.println(true);

        System.out.println("Check pw.txt for results");

        pw.close();
        }
}
