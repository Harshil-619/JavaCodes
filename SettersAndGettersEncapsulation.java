class Student {
    private int age;
    private String name;

    public int getAge() 
    {
        return age;
    }
    public void setAge(int age) 
    {
        this.age = age;
    }
    public String getName() 
    {
        return name;
    }
    
    public void setName(String name) 
    {
        this.name = name;
    }

    
}

public class SettersAndGettersEncapsulation {
    public static void main(String[] args) 
    {
        Student obj = new Student();
        Student obj1 = new Student();

        obj.setAge(19);
        obj.setName("Harshil");

        obj1.setAge(25);
        obj1.setName("Sasuke");

        int stud1Age = obj.getAge();
        String stud1Name = obj.getName();

        int stud2Age = obj1.getAge();
        String stud2Name = obj1.getName();

        System.out.println(stud1Age + " " + stud1Name);
        System.out.println(stud2Age + " " + stud2Name );

    }
}
