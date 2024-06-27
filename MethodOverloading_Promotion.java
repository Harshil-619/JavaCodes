class Method_Promotion {
    // public void show (byte num) {
    //     System.out.println("byte " + num);
    // }   
    // public void show (short num) {
    // System.out.println("short " + num);
    // }
    public void show (char num) {
    System.out.println("char " + num);
    }
    // public void show (int num) {
    // System.out.println("int " + num);
    // }
    // public void show (double num) {
    // System.out.println("double " + num);
    // }
    // public void show (long num) {
    //     System.out.println("long " + num);
    //     }
}
public class MethodOverloading_Promotion {
    public static void main(String[] args) {
        Method_Promotion obj = new Method_Promotion();

        char num =2;
        obj.show(num);
    }
}
