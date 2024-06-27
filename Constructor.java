class Student {
    private String name ;
    private int age ;

    Student (String name , int age){
        this.name = name ;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
}

public class Constructor {
    public static void main(String[] args) {
        Student st = new Student ("Jiraya",59);

        String name = st.getName();
        int age =st.getAge();

        System.out.println(name);
        System.out.println(age);
        
    }
    
}
