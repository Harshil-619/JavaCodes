// class Human {
//     int age;
//     void sleep ()
//     {
//         age=18;
//         System.out.println("Human is chutiya");
//         System.out.println(age);
//     }
// }
// class Student
// {

// }
// public class Inheritance1 {
//     public static void main(String[] args) {
//         Student st =new Student();
//         st.sleep(); //  error will occur because we are not applying any
//                     //  inheritance concept here as both classes are unlinked
//     }
// }


class Human {
    int age;
    public void sleep()
    {
        age=18;
        System.out.println("Human is chutiya");
        System.out.println(age);
    }
}
class Student extends Human
{

}
public class Inheritance1 {
    public static void main(String[] args) {
        Student st = new Student();
        st.sleep(); 
    }
}
