class Demo
{
    int age;
    String name;

    public void show () {
        System.out.println(age + " "+ name);
    }
}

public class Student {
    public static void main(String[] args) {
     Demo obj = new Demo();
     obj.age = 19; // This is code without ENCAPSULATION where 
     obj.name = "Harshil"; // we can access data from one calss to another class
     obj.show(); 
    }
}
