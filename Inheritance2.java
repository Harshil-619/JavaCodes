class Human {
    int age;
    private String name;
    Human()
    {
        System.out.println("Human class CONSTRUCTOR"); //Constructors are not inherited in child class just same as private variables
    }
    void sleep ()
    {
        age=18;
        name="obito";
        System.out.println("Human is chutiya");
        System.out.println(age);
    }
}
class Student extends Human
{
    // Student(){
    //     super();
    // } 

// Above is default constructor of child class student . This is done by compiler itself. 
// Super method always calls parent class constructor thats why Human() is executed even though it is not called

    void display() {
        System.out.println("The age is" + age);
        //System.out.println("The name is" + name); error occur because name is private . thus concepts of encapsulation is followed and not clashed
    }
}
public class Inheritance2 {
    public static void main(String[] args) {
        Student st =new Student();
        st.sleep(); 
        st.display();
    }
}






