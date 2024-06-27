class Aeroplane 
{
    void fly() 
    {
        System.out.println("Aeroplanes can fly");
    }
    void takeoff() 
    {
        System.out.println("Aeroplane is taking off");
    }
}
class CargoPlane extends Aeroplane
{
    void fly () 
    {
        System.out.println("Cargoplane flies at lower height");
    }
    public void takeoff() 
    {
        System.out.println("Cargoplane carries goods");
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
public class Polymorphism1 {
   public static void main(String[] args)
    {
        CargoPlane cp =new CargoPlane();
        PassengerPlane pp =new PassengerPlane();

        Aeroplane ref;

        ref=cp;
        
        ref.fly();
        ref.takeoff();

        System.out.println("-------------------------------------------------");
            ref=pp;
           ref.fly();
        ref.takeoff();
    

    }

}


