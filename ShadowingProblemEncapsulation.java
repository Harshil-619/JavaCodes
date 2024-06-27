class Student {
    private int age;
    private String name;

    public void setData(int age) {
        age=age; //Shadowing Problem arises
    }
    private void setData1(){
        name = "Harshil";
    }
    public void show (){
        System.out.println(age + " " + name); 
    }

}

public class ShadowingProblemEncapsulation {
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student();
        obj.setData(18);
        obj.show();
        obj1.setData(25);
        obj1.show();

    }
    
}
