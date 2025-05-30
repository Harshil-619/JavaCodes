import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer {
 String country() default "India";
 int age() default 35;
}

@CricketPlayer
class Virat
{
    @CricketPlayer
    private int innings;
    private int runs;

    public void setInnings(int innings) 
    {
        this.innings = innings;
    }
    @CricketPlayer
    public int getInnings ()
    {
        return innings;
    }

    public void setRuns (int runs)
    {
        this.runs = runs;
    }
    @CricketPlayer
    public int getRuns()
    {
        return runs;
    }

}

public class Annotations2Custom {
    public static void main(String[] args) {

        Virat v = new Virat();
        v.setInnings(576);
        v.setRuns(26561);

        System.out.println(v.getInnings());
        System.out.println(v.getRuns());

        Class c = v.getClass();
        Annotation a=c.getAnnotation(CricketPlayer.class);
       CricketPlayer cp= (CricketPlayer)a;

       String country = cp.country();
       int age = cp.age();

       System.out.println(country);
       System.out.println(age);
        
    }
}
