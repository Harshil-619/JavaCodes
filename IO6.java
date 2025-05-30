import java.io.*;

public class IO6 {
    public static void main(String[] args) throws Exception {
        File dir = new File("PW");
        File file = new File(dir, "pw.txt");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        // String line = br.readLine();
        char ch[] = new char[(int)file.length()];
        br.read(ch);
        for (char data : ch)
        {
            System.out.print(data);
        }

        // while(line != null)
        // {
        //     System.out.println(line);
        //     line=br.readLine();
        // }
    }
}
