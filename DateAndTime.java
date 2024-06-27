public class DateAndTime {
    public static void main(String[] args) {
        
        java.util.Date date = new java.util.Date();
        System.out.println(date);

        long l = date.getTime();

        java.sql.Date sd = new java.sql.Date(l);
        System.out.println(sd);
    }
}
