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