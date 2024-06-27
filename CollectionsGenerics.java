import java.util.*;
public class CollectionsGenerics {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList<>();
        al1.add(10);
        al1.add(123);
        al1.add(25);
        al1.add(74);
        al1.add(96);

        System.out.println(al1);
        Collections.sort(al1);
        System.out.println(al1);

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Harshil");
        al2.add("PW");
        al2.add("JAVA");
        al2.add("SQL");
        al2.add("Developer");

        System.out.println(al2);
        Collections.sort(al2);
        System.out.println(al2); 
        
        ArrayList al3 = new ArrayList<>();
        al3.add(10);
        al3.add(123);
        al3.add(25);
        al3.add(25);
        al3.add(96);

        System.out.println(al3);
        int index =Collections.binarySearch(al3, 25);
        System.out.println("The index is : " +index);
        int index2 =Collections.binarySearch(al3, 69);
        System.out.println("The index is : " +index2); //Output will be -ve , hence number is not in the list       

       // System.out.println(al3);
        Collections.rotate(al3, 2);
        System.out.println(al3);

       

        System.out.println(Collections.frequency(al3, 25));

        Collections.reverse(al3);
        System.out.println(al3);

        Collections.shuffle(al3);
        System.out.println(al3);//Everytime when you run the program  you will get different output


    }
}
