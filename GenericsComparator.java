import java.util.*;

class Student5
{
    int marks;
    int age;
    String name;

    public Student5(int marks, int age, String name) {
        this.marks = marks;
        this.age = age;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    
    public String toString()
    {
        return " " + marks + "-" + age + "-" + name;
    }

    
}

public class GenericsComparator {
    public static void main(String[] args) {

        Student5 st1 = new Student5(25, 22, "Kiran");
        Student5 st2 = new Student5(97, 19, "Harshil");
        Student5 st3 =new Student5(82, 18, "Rudra");

        Comparator<Student5> cm = (Student5 a, Student5 b) ->
        {
            if(a.age>b.age)
            {
                return 1;
            }
            else {
                return -1;
            }
        };

        List<Student5> list = new ArrayList();
        list.add(st1);
        list.add(st2);
        list.add(st3);

       // Collections.sort(list);
       Collections.sort(list,cm );

       System.out.println(list);


        
    }
    
}
