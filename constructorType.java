class Demo {
    private int age;
    private String name;


    public Demo () {
        System.out.println("Zero Parameterized Constructor by programmer");
    }

    public Demo (int age, String name) {
        System.out.println("Parameterized Constructor by programmer");
        this.age =age;
        this.name = name;
    }
    void disp() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class constructorType {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.disp();

        Demo d2 = new Demo (59, "Tsunade");
        d2.disp();
    }
    
}
