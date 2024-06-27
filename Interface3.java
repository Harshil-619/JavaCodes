interface A {
    void show ();
}
interface X {
    void abc ();
}
class B implements A,X 
{
    public void show ()
    {
        System.out.println("in show");
    }
    public void abc ()
    {
        System.out.println("in abc");
    }
}
public class Interface3 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        //obj.abc(); This is error obj is reference of A and A does not have any abc() method. This is how interface is used for specification
    }
}
