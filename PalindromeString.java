import java.util.*;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your String");
        String str1 = scan.nextLine();
        String str2 = "";

        for (int i = str1.length()-1; i>=0; i-- ) 
        {
            str2 = str2 + str1.charAt(i);
        }
        if (str1.equalsIgnoreCase(str2))
        {
            System.out.println(str1 + " is Palindrome String");
        }
        else {
            System.out.println(str1 + " is not a Palindrome String");
        }
    }
}
