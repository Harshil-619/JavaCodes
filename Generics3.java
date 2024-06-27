class Gen<T>
{
    private T obj;

    public Gen(T obj)
    {
        this.obj = obj;
    }

    void disp()
    {
        System.out.println("The type of object is : " + obj.getClass().getName());
    }
    public T getObj(){
        return obj;
    }
}

public class Generics3 {
    public static void main(String[] args) {
        Gen<Integer> g1 = new Gen<Integer>(7);
        g1.disp();
        System.out.println(g1.getObj());
        System.out.println("*******************************************");
        Gen<String> g2 = new Gen<String>("Harshil");
        g2.disp();
        System.out.println(g2.getObj());           
        
    }
}
