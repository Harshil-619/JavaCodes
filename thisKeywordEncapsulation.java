class Student {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age=age; //Using 'this' keyword to solve Shadowing Problem
    }
    void setName(String name){
        this.name = name;
    }
    public void show (){
        System.out.println(age + " " + name); 
    }

}

public class thisKeywordEncapsulation {
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student();

        obj.setAge(19);
        obj.setName("Harshil");

        obj1.setAge(25);
        obj1.setName("Sasuke");
        
        obj.show();
        obj1.show();
    }
}

