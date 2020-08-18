import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,100);
        map.put(2,200);
        map.put(3,300);
        for (Map.Entry<Integer,Integer> entry : map.entrySet() ) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }


}
