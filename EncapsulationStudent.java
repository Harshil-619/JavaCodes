class Student {
    private int age;
    private String name;

    void setData() {
        age = 19;
        name = "Harshil";
    }
    public void show (){
        System.out.println(age + " "+ name);
    }
}

public class EncapsulationStudent {
    public static void main(String[] args) {
        Student obj = new Student();
        //obj.name="Bhatt Harshil"; This is not possible 
       // obj.age = 20; Because we use Encapsulation
        obj.setData();
        obj.show();
    }
}
