import java.util.*;
public class CollectionHasSet {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(100);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        System.out.println(hs);

        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(100);
        lhs.add(20);
        lhs.add(30);
        lhs.add(40);
        System.out.println(lhs);


    }
}
