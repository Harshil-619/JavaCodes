import java.util.ArrayDeque;

public class CollectionArrayDeque {
    public static void main(String[] args) {
        ArrayDeque ad1 = new ArrayDeque();

        ad1.add(100);
        ad1.add(200);
        ad1.add(300);
        ad1.add(300);
        System.out.println(ad1);

        ad1.addFirst(10);
        ad1.addLast("PW");
        System.out.println(ad1);

        ad1.offer(500);
        ad1.offerFirst(7);
        ad1.offerLast(700);
        System.out.println(ad1);

        System.out.println(ad1.poll());
        System.out.println(ad1);

        System.out.println(ad1.element());
        System.out.println(ad1);

        System.out.println(ad1.peek());
        System.out.println(ad1);



        


    }
}
