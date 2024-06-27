import java.util.*;
public class MapHashMap {
    public static void main(String[] args) {
        HashMap hm1 = new HashMap();
        hm1.put(null,null );
        hm1.put(02, "Rohit");
        hm1.put(03, "Rohan");
        hm1.put(04, "Rohan");
        hm1.put(04, "Rohan");
        System.out.println(hm1);

        HashMap hm2 = new HashMap();
        hm2.put("Virat", "Rohit");
        hm2.put("Rohit", "Rohan");
        hm2.put("Hyder", "Rohan");
        System.out.println(hm2);

        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put("Virat", "Rohit");
        lhm.put("Rohit", "Rohan");
        lhm.put("Hyder", "Rohan");
        System.out.println(lhm);
  
    }
}
