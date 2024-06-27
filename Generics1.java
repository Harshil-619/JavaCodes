import java.util.*;
public class Generics1 {
    public static void main(String[] args) {
        //Problem Code to understand need of Generics :-


        //Typesafety
        String a[] = new String[5];
        a[0]= "Harshil";
        a[1]= "PW";
        //a[2]= 10; Compile Time Error , Becoz array provides Typesafety

        ArrayList al = new ArrayList();
        al.add("HARSHIL");
        al.add("PW");
        al.add(10);

        //Retreiving data
        String n1 = (String) al.get(0);
        String n2 = (String) al.get(1);
       // String n3 = (String) al.get(2); Result in ClassCast Exception


       //Solution Code using Generics :-
       ArrayList<String> al1 = new ArrayList<String>();
       al1.add("harshil");
       al1.add("PW");
       //al1.add(10); Compile Time error, hence Typesafety acheived

       //We don't need to perform typesafety
       String name1 = al1.get(0);
       String name2 = al1.get(1);


    }
}
