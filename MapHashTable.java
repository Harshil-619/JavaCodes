import java.util.*;
import java.util.Map.*;

public class MapHashTable {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(1,"Harshil");
      //  ht.put(2,"Rohan");
        ht.put(4,"Neha");
        ht.putIfAbsent(2,"Rohan");
        ht.put("gayatri", "Harshil");
      //  ht.put(8,null);

        System.out.println(ht);


        TreeMap tm = new TreeMap();
        tm.put(3,"Hardhy");
        tm.put(7,"Neha");
        tm.put(5, "Gayatri");
        tm.put(1,"Harshil");
        //ignored tm.put(1,"Harshil");
        tm.put(4,null);
        System.out.println(tm);
        System.out.println(tm.get(7));

        Set keySet = tm.keySet();
        System.out.println(keySet);
        Iterator itr = keySet.iterator();
        while(itr.hasNext())
        {
            //System.out.println(itr.next());
            Integer key = (Integer)itr.next();
            System.out.println(key);
        }

        Collection values = tm.values();
        Iterator itr2 = values.iterator();
        while(itr2.hasNext())
        {
            //System.out.println(itr2.next());
            String names = (String)itr2.next();
            System.out.println(names);
        }

        Set entrySet = tm.entrySet();
        Iterator itr3 = entrySet.iterator();
        while(itr3.hasNext())
        {
            //System.out.println(itr3.next());
            Map.Entry data = (Entry)itr3.next();
            System.out.println(data.getKey() + " : " + data.getValue());
        }

    }
}
