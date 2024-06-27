import java.util.Scanner;
public class StringReversing {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your String you want to revrse");
    String str1 = scan.nextLine( );
    System.out.println("Your string is " + str1 );

        String str2 = "";

        for (int i= str1.length()-1; i>=0; i--) {
            str2 = str2 + str1.charAt(i);
        }
        System.out.println("Before Reversing :" + str1);
        System.out.println("After Reversing :" + str2);
    }
}



// public class StringReversing {
//     public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);
//     System.out.println("Enter your String you want to revrse");
//     String str1 = scan.nextLine( );
//     System.out.println("Your string is " + str1 );

//         String str2 = "";
//         String Sarr[]= str1.split(" ");

//         for (int i = Sarr.length-1; i>=0; i--) {
//             str2 = str2 + Sarr[i] + " ";
//         }
//         System.out.println("Before Reversing :" + str1);
//         System.out.println("After Reversing :" + str2);
//     }
// }



// public class StringReversing {
//     public static void main(String[] args)  {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter your String you want to revrse");
//         String str1 = scan.nextLine( );
//         System.out.println("Your string is " + str1 );
//         String str2 = "";
//         String Sarr[]= str1.split(" ");

//         for (String elem : Sarr) 
//         {
//             for (int i = elem.length()-1 ; i>=0; i--) 
//             {
//                 str2 = str2 + elem.charAt(i);
//             }
//             str2 = str2 + " ";
//         }
//         System.out.println("Before Reversing :" + str1);
//         System.out.println("After Reversing :" + str2);
//     }
// }