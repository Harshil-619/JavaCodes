import java.net.SocketPermission;

public class Increment {
    public static void main(String[] args) {
        int a = 5;
        int b = a++;
        System.out.println(a);
        System.out.println(b);

        int A = 5;
        int B = ++A;
        System.out.println(A);
        System.out.println(B);
    }
}
