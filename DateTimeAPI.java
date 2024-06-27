import java.time.*;

public class DateTimeAPI {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        int day=date.getDayOfMonth();
        int month=date.getMonthValue();
        int year = date.getYear();
        System.out.println(day + "/"+ month + "/" + year); 
        

        LocalTime time = LocalTime.now();
        System.out.println(time);
        int hour=time.getHour();
        int minute = time.getMinute();
        int sec = time.getSecond();
        int nano = time.getNano();

        System.out.println(hour + ":" + minute +":"  + sec +":" + nano);
    }
}
