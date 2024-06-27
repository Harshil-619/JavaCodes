interface car 
{
    void drive ();
}

public class AnonyInnerClass {
    public static void main(String[] args) {
        car obj = new car()
        {
            public void drive()
            {
                System.out.println("Driving...");
            }
        };
        obj.drive(); 
    }
}
