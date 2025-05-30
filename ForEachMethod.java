import java.util.*;
import java.util.function.Consumer;
public class ForEachMethod {
    public static void main(String[] args) {
        // List<Integer> list1 = new ArrayList<Integer> ();
        // list1.add(2);
        // list1.add(4);
        // list1.add(6);
        // list1.add(8);

        // System.out.println(list1);

        List<Integer> list2 = Arrays.asList(2,4,6,8);
        System.out.println(list2);

        //We can access loop using For Each loop
        // for(Integer i : list2)
        // {
        //     System.out.println(i);
        // }

        //We can also use Funcrional interface Consumer also :
        // Consumer <Integer> cons = new Consumer <Integer>()
        // {
        //     @Override
        //     public void accept(Integer i)
        //     {
        //         System.out.println(i);
        //     }
        // };
        // list2.forEach(cons);


                    // Consumer<Integer> cons = (Integer i)-> 
                    // {
                    //     System.out.println(i);

                    // };
                    // list2.forEach(cons);

    //There is only one body statement inside Functional Interface so we can also

    list2.forEach(i->System.out.println(i));

    }
}
