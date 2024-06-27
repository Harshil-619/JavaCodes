import java.util.*;

import javafx.scene.web.WebHistory;
import javafx.scene.web.WebHistory.Entry;
public class MapAccessHashMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,"Rohan");
        map.put(2,"Rohit");
        map.put(3,"Rahul");
        map.put(4,"Ramesh");
        System.out.println(map);
        System.out.println(map.get(4));

        Set keySet=map.keySet();
        Iterator itr1 = keySet.iterator();
        while (itr1.hasNext()) {
           // System.out.println(itr1.next());
           Integer key = (Integer)itr1.next();
           System.out.println(key);

        }

        Collection values = map.values();
        Iterator itr2 = values.iterator();
        while (itr2.hasNext()) {
            //System.out.println(itr2.next());
           String names = (String)itr2.next();
           System.out.println(names);
  
        }

        Set entrySet = map.entrySet();
        Iterator itr3 = entrySet.iterator();
        while(itr3.hasNext())
        {
          //System.out.println(itr3.next());
           Map.Entry data= (Map.Entry)itr3.next();
           System.out.println(data.getKey() + " : " + data.getValue());
  
        }

    }
}
