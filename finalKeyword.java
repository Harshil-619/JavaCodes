// final class Animal 
// {
//     void sleep()
//     {
//         System.out.println("Animal is sleeping");
//     }
// }
class Animal 
{
        final int age =19;
    
   final void sleep()
    {
        // age = 20; we cannot change value of final variable
        System.out.println("Animal is sleeping");
    }
}
class Tiger extends Animal // We cannot inherit final classes

{

    // void sleep() We can inherit final methods but we cannot override final methods in child class
    // {
    // }
}
public class finalKeyword {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sleep();
    }
}
