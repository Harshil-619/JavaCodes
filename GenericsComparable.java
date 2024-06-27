import java.util.*;

class Student6 implements Comparable<Student6> 
{
    int marks;
    int age;
    String name;

    public Student6(int marks, int age, String name) {
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

    public int compareTo(Student6 st)
    {
        if(this.age>st.age)
        {
            return 1;
        }
        else {
            return -1;
        }
    }

    
}

public class GenericsComparable {
    public static void main(String[] args) {

        Student6 st1 = new Student6(25, 22, "Kiran");
        Student6 st2 = new Student6(97, 19, "Harshil");
        Student6 st3 =new Student6(82, 18, "Rudra");

        

        // Comparator<Student5> cm = (Student5 a, Student5 b) ->
        // {
        //     if(a.age>b.age)
        //     {
        //         return 1;
        //     }
        //     else {
        //         return -1;
        //     }
        // };

        List<Student6> list = new ArrayList();
        list.add(st1);
        list.add(st2);
        list.add(st3);

       Collections.sort(list);
      // Collections.sort(list,cm );

       System.out.println(list);


        
    }
    
}
