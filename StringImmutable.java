public class StringImmutable {
    public static void main(String[] args) {
        String s1="Harshil";
        String s2="Harshil";
        System.out.println(s1==s2);

        String s3 =new String ("Harshil");
        String s4 = new String ("Harshil");
        System.out.println(s3==s4);

    }
}
