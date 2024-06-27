public class ExceptionSecond {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 2;
        int result=0;
        int values [] = {4,5,2,3,7};
        String name = null;

        try {
        result = num1/name.length();
        System.out.println(values[6]);

        }
        catch(ArithmeticException ae) {
            System.out.println("Cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println(("Stay in your limits"));
        }
        catch (Exception e) {
            System.out.println("Something went wrong...");
        }
        if (result==0)
        {
        System.out.println("Infinite");
        }
        else {
            System.out.println(result);
        }
        System.out.println("Bye");
    }
}

