public class String1 {
    public static void main(String[] args) {
        String name="Harshil";
        System.out.println(name);
        name.concat(" Bhatt");
        System.out.println(name);

        StringBuilder name1 = new StringBuilder("Harshil");
        System.out.println(name1);
        name1.append(" Bhatt");
        System.out.println(name1);
    }

}
