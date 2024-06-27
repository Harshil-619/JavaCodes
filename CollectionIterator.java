import java.util.*;
public class CollectionIterator {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(100);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        System.out.println(al1);

        Iterator itr = al1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        ListIterator litr = al1.listIterator(al1.size());
        while(litr.hasPrevious())
        {
            System.out.println(litr.previous());
        }

    }
}
