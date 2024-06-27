public class StaticBlock {
    static int age = 18;
    static
    {
        System.out.println("Static Block Fiirst");
        System.out.println(age);
    }
public static void main(String[]args) {
    System.out.println("Main Metyhod baad mein");
}
    
}
