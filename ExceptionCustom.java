import java.util.*;
class MyException extends Exception {
    public MyException () {
    }
    public MyException(String msg) 
    {
        super(msg);
        System.out.println(msg);
    }
}

public class ExceptionCustom {

 public static void main(String[] args) {
int num1;
int num2;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter num1 :");
        num1 = sc.nextInt();
        System.out.println("Enter num2");
        num2 = sc.nextInt();
        System.out.println("Your num1 and num2 are " + num1 +" and " + num2);
        try {
            if (num2 < 0) {
                MyException me = new MyException("num2 is Negative number");
                throw me;
               
            }
            else {
        int result = num1/num2;
        System.out.println("Your result is : " + result);
            }   
    }
        catch (Exception me) {
            System.out.println("Enter a valid number " + me.getMessage() );
        }
    }
}

