//Functional Interface
@FunctionalInterface
interface Demo
{
    void disp();
    //void disp2();
}

//this is parent class or base class
class Plane555 
{
    public void flying ()
    {
        System.out.println("Plane is flying high");
    }
}

//this is child class or sub class
class CargoPlane555 extends Plane555 
{
    //Overriden method from parent class
    @Override
    public void flying()
    {
        System.out.println("Plane is flying low");
    }
}



public class Annotations1 {
    public static void main(String[] args) {

        //object of child class
        Plane555 cp = new CargoPlane555();
        cp.flying();
        
    }
}
