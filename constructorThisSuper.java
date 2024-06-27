class Student1 {
    private String name;
    private int age ;

    public Student1() {
        //super();
        this (59,"Jiraya");
        name = "Harshil";
        age = 19;
    }
    public Student1(String name) {
        this();
        this.name = name;
        age=16;
    }
    public Student1(int age , String name) {
        this.name=name;
        this.age = age;
    }
    void disp () {
        System.out.println(name);
        System.out.println(age);
        System.out.println();
    }
}

public class constructorThisSuper {
    public static void main(String[] args) {
        Student1 st1 = new Student1();
        st1.disp();

        Student1 st2 = new Student1 ("Naruto");
        st2.disp();

        Student1 st3 = new Student1 (59,"Jiraya");
        st3.disp();
    }
}
