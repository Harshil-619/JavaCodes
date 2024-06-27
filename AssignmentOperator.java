public class AssignmentOperator {
    public static void main(String[] args) {
        int m1, m2, m3, m4;
        m1 = m2 = m3 = m4 = 10;
        System.out.println(m1 + " " + m2 + " " + m3 + " " + m4);

        int a, b, c, d;
        a = b = c = d = 10;

        a += 5;
        b -= 5;
        c /= 5;
        d *= 5;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
