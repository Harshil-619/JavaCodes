import java.util.*;
import java.util.Map.*;

class Students1 {
    private String name;
    private int age;
    private String city;

    public Students1(String name, int age, String city)
    {
        this.name=name;
        this.age= age;
        this.city=city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return  name + " "+ age + " "  + city ;
    }
    
}

public class MapHashMap2 {
    public static void main(String[] args) {
        Students1 st1 = new Students1("Rohan", 18, "Bengaluru");
        Students1 st2 = new Students1("Rohit", 19, "Delhi");
        Students1 st3 = new Students1("Ramesh", 22, "Mysuru");

        Map map = new HashMap();
        map.put(1, st1);
        map.put(2, st2);
        map.put(3, st3);
        System.out.println(map);

        Set set = map.entrySet();
        Iterator itr = set.iterator();

        while(itr.hasNext())
        {
            Map.Entry data = (Entry)itr.next();
            System.out.println(data.getKey() + " : " + data.getValue());
        }
    }
}
