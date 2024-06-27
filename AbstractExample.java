abstract class Aeroplane 
{
    abstract public void fly(); 

    abstract public void takeoff();

    public void landing () 
    {
        System.out.println("Aeroplane is landing");
    }
    
}
class CargoPlane extends Aeroplane
{
    public void fly () 
    {
        System.out.println("Cargoplane flies at lower height");
    }
    public void takeoff() 
    {
        System.out.println("Cargoplane carries goods");
    }
    public void alert ()
    {
        System.out.println("ALERT.....");
    }
    
}
class PassengerPlane extends Aeroplane
{
    public void fly() 
    {
        System.out.println("PassengerPlane flies at medium height");
    }
    public void takeoff() 
    {
        System.out.println("PassengePlane carries passengers");
    }
}
public class AbstractExample {
   public static void main(String[] args)
    {
        Aeroplane ref1 = new CargoPlane();
        ref1.fly();
        ref1.takeoff();
        ref1.landing();
        ((CargoPlane)ref1).alert();

        Aeroplane ref2 = new PassengerPlane();
        ref2.fly();
        ref2.takeoff();
        
    

    }

}




