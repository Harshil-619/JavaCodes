import java.util.*;
public class ExceptionThrow {
       static int num1;
       static int num2;

    void InputValues ()
    {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter num1 :");
        num1 = sc.nextInt();
        System.out.println("Enter num2");
        num2 = sc.nextInt();
        System.out.println("Your num1 and num2 are " + num1 +" and " + num2);
  
    }
    public static void main(String[] args) {
        ExceptionThrow et = new ExceptionThrow();
        et.InputValues();
        try {
            if(num2<0) {
                Exception e = new Exception();
                throw e;
            }
            else {
        int result = num1/num2;
        System.out.println("Your result is : " + result);
            }   
    }
        catch (Exception e) {
            System.out.println("Enter a valid number " + e.getMessage());
        }
    }
}
