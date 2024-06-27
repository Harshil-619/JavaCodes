public class MutableString {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer ("Harshil");
        StringBuilder str2= new StringBuilder("Naruto");
        System.out.println(str);
        System.out.println(str2);
        str.append(" Bhatt");
        str2.append(" Uzumaki");
        System.out.println(str);
        System.out.println(str2);
    }
    
}
