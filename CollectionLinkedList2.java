import java.util.*;

import javax.swing.SpringLayout;

public class CollectionLinkedList2 {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();

        ll1.add(3);
        ll1.add(5);
        ll1.add(7);
        ll1.add(9);
        ll1.add(11);
        ll1.add(11);
        System.out.println(ll1);

        System.out.println(ll1.get(2));
        System.out.println(ll1.indexOf(7));
        System.out.println(ll1.getFirst());
        System.out.println(ll1.getLast());
        System.out.println(ll1.indexOf(11));
        System.out.println(ll1.lastIndexOf(11));

        ll1.push(13);
        System.out.println(ll1);
        System.out.println(ll1.pop());
        System.out.println(ll1);


    }
}
