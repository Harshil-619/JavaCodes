import java.util.*;
public class CollectionTreeSet {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);

        System.out.println(ts);

        System.out.println(ts.higher(50)); //75 greater than
        System.out.println(ts.lower(50)); //25  lower than
        
        System.out.println(ts.ceiling(40)); //50  
        System.out.println(ts.floor(40));  //25

        System.out.println(ts.ceiling(50)); //50  greater than or equal too
        System.out.println(ts.floor(50)); //50    smaller than or equal too



    }
}
