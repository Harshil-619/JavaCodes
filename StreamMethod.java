import java.util.*;
import java.util.stream.*;

public class StreamMethod {
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(2,4,6,8);
        System.out.println(list);

        Stream <Integer> streamData=list.stream();
        streamData.forEach(n->System.out.println(n));
       // streamData.forEach(n->System.out.println(n));
    }
}
