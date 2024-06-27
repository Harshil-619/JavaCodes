// public class StringEqualMethod {
//     public static void main(String[] args) {
//         String name1 = "Harshil";
//         String name2= new String ("Harshil");

//         System.out.println(name1==name2); // compares references of String
//         System.out.println(name1.equals(name2)); // compares values or content of String
//     }
// }

// public class StringEqualMethod {
//     public static void main(String[] args) {
//         String name1 = "Harshil";
//         String name2 = "Harshil";
//         String name3 = "HARSHIL";

//         System.out.println(name1==name2);
//         System.out.println(name1==name3);
//         System.out.println(name1.equals(name2));
//         System.out.println(name1.equals(name3));
//     }
// }

public class StringEqualMethod {
    public static void main(String[] args) {
        String name1 = "Harshil";
        String name2 = new String ("Harshil");
        String name3 = new String ("HARSHIL");

        System.out.println(name1==name2);
        System.out.println(name2==name3);
        System.out.println(name1.equals(name2));
        System.out.println(name1.equalsIgnoreCase(name3));
    }
}

