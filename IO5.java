import java.io.*;

public class IO5 {
    public static void main(String[] args) throws Exception {
        
        File dir = new File("PW");
        File file = new File(dir, "pw.txt");

        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("java");
        bw.newLine();
        bw.write(65);
        bw.newLine();
        char ch[] = {'P' , 'W' ,'S' ,'J'};
        bw.write(ch);

        bw.flush();
        bw.close();

        System.out.println("Check pw.txt to see result");


    }
    
}
