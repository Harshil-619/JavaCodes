// public class StringConcat {
//     public static void main(String[] args) {
//         String s1 = new String("pw");
//         s1=s1.concat("skills");
//         System.out.println(s1);
//     }
// }


// public class StringConcat {
//     public static void main(String[] args) {
//        String s1 = "pwjava";
//        String s2 = s1.concat("Skills");
//        String s3 = new String("pwjava");
//        s3 = s3.concat("Skills");

//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//     }
// }

public class StringConcat {
    public static void main(String[] args) {
       String s1 = "pw";
       String s2 = "pw" + "java";
       String s3 = "pw" + "java" + "skills";
       String s4 = s1+ s2;

       String str = "Pw" + 100 + 99; 

       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);
       System.out.println(s4);
       System.out.println(str);
    }
}