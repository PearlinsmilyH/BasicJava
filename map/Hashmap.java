
import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> veg = new HashMap<String, Integer>();
        veg .put("carrot", 5);
        veg .put("beetroot", 9);
        veg .put("potato", 8);
        veg .put("onion",6);
        veg .put("beans", 4);
        for (String i:veg.keySet())
        {
            System.out.println(i+"  " +veg.get(i));
        }
    }
}

