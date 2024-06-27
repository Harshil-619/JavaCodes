public class Logical {
    public static void main(String[] args) {
        int a, b, c;
        a = 10;
        b = 20;
        c = 30;
        System.out.println(a == b && a < b && a > b);
        System.out.println(a < b && a != b && a < c);
        System.out.println(a == b || a < 20 || a > c);
        System.out.println(a == b || a > c || a > b);
        System.out.println(!(a > b));
        System.out.println(!(a < c));
    }

}
