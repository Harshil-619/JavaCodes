import java.util.*;


public class AnagramString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your String 1");
        String str1 = scan.nextLine();
        System.out.println("Enter your String 2");
        String str2 = scan.nextLine();

        str1 = str1.replace(" ","");
        str2 = str2.replace(" ","");

        str1=str1.toLowerCase();
        str2 = str2.toLowerCase();

        char arr1[] = str1.toCharArray();
        char arr2[]= str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        

        if (Arrays.equals(arr1,arr2))
        {
            System.out.println(str1 + " & " + str2 + " " + "Both Strings are anagram");
        }
        else
        {
            System.out.println(str1 + " & " + str2 + " " + "Both are not anagrams");
        }

    }
    
}
