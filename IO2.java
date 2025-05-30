import java.io.*;

public class IO2 {
    public static void main(String[] args) throws Exception {
        File dir = new File ("HarshilCodes");
        System.out.println(dir.isDirectory());
        dir.mkdir();
        System.out.println("dir is refering to HArshilCodes " + dir.isDirectory());

        File file = new File(dir,"Code1");
        file.createNewFile();
        System.out.println("file is refering to Code1 " + file.isFile());

        int count =0;
        File f = new File("HarshilCodes");
        String str[] = f.list();
        for(String name : str) 
        { 
            count++;
            System.out.println(name);
        }
        System.out.println("No. of files are " + count);
    }
}
