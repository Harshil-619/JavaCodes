import java.util.*;
public class CollectionLinkedList1 {
    public static void main(String[] args) {
        LinkedList ll1= new LinkedList();
        ll1.add(100);
        ll1.add(200);
        ll1.add(300);
        System.out.println(ll1);


        LinkedList ll2 = new LinkedList();
        ll2.add("PwSkill");
        ll2.add(2.3);
        ll2.add(4);
        ll2.add(7);
        System.out.println(ll2);

        LinkedList ll3 = new LinkedList();
        ll3.add(10);
        ll3.add(20);
        ll3.add(30);

        ll3.addFirst("JAVA");
        ll3.addLast("Harshil");
        System.out.println(ll3);

        ll3.add(2,007);
        System.out.println(ll3);

        System.out.println(ll3.peek());
        System.out.println(ll3);

        System.out.println(ll3.poll());
        System.out.println(ll3);

    }
}
