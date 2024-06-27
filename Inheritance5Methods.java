class Aeroplane 
{
    void fly() //overridden method
    {
        System.out.println("Aeroplanes can fly");
    }
    void takeoff() //Inherited method
    {
        System.out.println("Aeroplane is taking off");
    }
}
class CargoPlane extends Aeroplane
{
    void fly () //overriding method
    {
        System.out.println("Cargoplane flies at lower height");
    }
    public void carryGoods() //specialized method
    {
        System.out.println("Cargoplane carries goods");
    }
    
}
class PassengerPlane extends Aeroplane
{
    public void fly() //overriiding method
    {
        System.out.println("PassengerPlane flies at medium height");
    }
    public void carryPassengers() //specialized method
    {
        System.out.println("PassengePlane carries passengers");
    }
}
public class Inheritance5Methods {
   public static void main(String[] args)
    {
        CargoPlane cp =new CargoPlane();
        cp.fly();
        cp.carryGoods();
        cp.takeoff();

        PassengerPlane pp =new PassengerPlane();
        pp.fly();
        pp.carryPassengers();
        pp.takeoff();
    }

}


// There are 3 types of method in inheritance 
//Inherited methods
//Override methods
//Specialized methods

//Inherited methods:
//Method which is directly inherited into child class without any modifications are inherited methods
//eg: takeoff()

//Override methods
//Method which is repeated in child class from parent class but that same method is modified are overriding methods
//methods from which it is in herited are called overridden methods
//eg: void fly() 

//Specialized methods
//Methods which are donly present in child class and dont have any connections from parent class
//are called Specialized methods
//eg: void carryGoods () & void carryPassengers()
