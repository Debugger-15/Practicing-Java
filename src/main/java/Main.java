import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Map testMap = new HashMap();
        testMap.put("A",1);
        testMap.put("B",2);
        testMap.put("C",3);
        testMap.put("E",5);
        testMap.put("D",4);
        testMap.put("F",6);
        System.out.println(testMap);


        Map map = new TreeMap(testMap);
        System.out.println(map);
    }
}

