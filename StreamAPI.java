import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StreamAPI {
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(8,2,4,7,5);
        Stream<Integer> streamData = list.stream();
        // long count = streamData.count();
        // System.out.println(count);
        //streamData.forEach(n->System.out.println(n));

        // Stream<Integer> filData = streamData.filter(n->n%2==0);
        // Stream<Integer> sortedStream=filData.sorted();
        // Stream<Integer> mapStream=sortedStream.map(n->n*2);
        // mapStream.forEach(n->System.out.println(n));

        Stream<Integer> finalStream = streamData
        .filter(n->n%2==0)
        .sorted()
        .map(n->n*2);

        finalStream.forEach(n->System.out.println(n));


        //Now lets see how filter method works with itds functional interface
        // Predicate <Integer> pre = new Predicate<Integer>()
        // {
        //     public boolean test(Integer i)
        //     {
        //         if(i%2==0)
        //         return true;
        //         else 
        //         return false;
        //     }
        // };
        // Stream<Integer> finalStream = streamData
        // .filter(pre)
        // .sorted()
        // .map(n->n*2);

        // finalStream.forEach(n->System.out.println(n));

         //Now lets it shorter by using lambda expression
        //  Predicate <Integer> pre = (Integer i) ->
        //  {
            
        //          if(i%2==0)
        //          return true;
        //          else 
        //          return false;
             
        //  };
        //  Stream<Integer> finalStream = streamData
        //  .filter(pre)
        //  .sorted()
        //  .map(n->n*2);
 
        //  finalStream.forEach(n->System.out.println(n));

        //Now lets make it more short
        // Predicate <Integer> pre = (Integer i) -> i%2==0;
     
        // Stream<Integer> finalStream = streamData
        // .filter(pre)
        // .sorted()
        // .map(n->n*2);

        // finalStream.forEach(n->System.out.println(n));

        //Now lets make it more shorter 
        // Predicate <Integer> pre =  i -> i%2==0;
     
        // Stream<Integer> finalStream = streamData
        // .filter(pre)
        // .sorted()
        // .map(n->n*2);

        // finalStream.forEach(n->System.out.println(n));

        //lets make it most shortest without using Predicate like in 1st attempt and directly putting implementation in filter method
        //Now lets make it more more shorter 
        // Stream<Integer> finalStream = streamData
        // .filter(i -> i%2==0)
        // .sorted()
        // .map(n->n*2);

        // finalStream.forEach(n->System.out.println(n));
        


    }
}
