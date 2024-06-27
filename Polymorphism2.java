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
class FighterPlane extends Aeroplane 
{
    void fly() 
    {
        System.out.println("Fighterplane can fly");
    }
    void takeoff() 
    {
        System.out.println("Fighterplane is taking off");
    }
}
class Airport 
{
    public void poly (Aeroplane ref)
    {
        ref.takeoff();
        ref.fly();
        System.out.println("-------------------------------------------------");
    }
}
public class Polymorphism2 {
   public static void main(String[] args)
    {
        CargoPlane cp =new CargoPlane();
        PassengerPlane pp =new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        Airport a = new Airport();
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);
    

    }

}


