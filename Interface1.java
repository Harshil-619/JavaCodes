interface A {
    int num = 7;
    void show();
}

public class Interface1 {
    public static void main(String[] args) {
        System.out.println(A.num);
       // A obj = new A();  runtime error
    }
}
