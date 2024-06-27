import java.util.*;
// InputMismatchException
// public class ExceptionFinally {
//     public static void main(String[] args) {
//         int num =0;
//         Scanner sc = new Scanner(System.in);
//         num = sc.nextInt();
//         System.out.println(num);

//     }
// }

public class ExceptionFinally 
{
    public static void main(String[] args) {
        int num =0;
        Scanner sc = new Scanner(System.in);
        try {
            num = sc.nextInt();
        }
        catch(InputMismatchException e) {
            System.out.println("Enter a number");
        }
        finally {
            sc.close();
            System.out.println("Resource closed");
        }
        System.out.println(num);
    }
}