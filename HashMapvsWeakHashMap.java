// import java.util.*;
// class Employee
// {
//     private String ename;
//     private int empid; 

//     public Employee(String ename, int empid) 
//     {
//         this.ename = ename;
//         this.empid=empid;
//     }
//     public String toString()
//     {
//         return empid + "";

//     }
//     @Override
//     public void finalize()
//     {
//         System.out.println("Clean up work by GC before deallocating memory from heap");
//     }

// }


// public class HashMapvsWeakHashMap {
//     public static void main(String[] args) {
//         Employee e = new Employee("Harshil", 7);
//         HashMap hm = new HashMap();
//         hm.put(e, "Harshil");
//         System.out.println(hm);
        
//         e= null; //Eligible for Garbage collection
//         System.gc(); //Invocking gc

//         System.out.println("Last Line");
//     }
// }




import java.util.*;
class Employee
{
    private String ename;
    private int empid; 

    public Employee(String ename, int empid) 
    {
        this.ename = ename;
        this.empid=empid;
    }
    public String toString()
    {
        return empid + "";

    }
    @Override
    public void finalize()
    {
        System.out.println("Clean up work by GC before deallocating memory from heap");
    }

}


public class HashMapvsWeakHashMap {
    public static void main(String[] args) {
        Employee e = new Employee("Harshil", 7);
        WeakHashMap hm = new WeakHashMap();
        hm.put(e, "Harshil");
        System.out.println(hm);
        
        e= null; //Eligible for Garbage collection
        System.gc(); //Invocking gc

        System.out.println(hm);
        System.out.println("Last Line");
    }
}
