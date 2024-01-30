
import java.util.*;
public class Treehashmap
    {
        public static void main(String[] args)
        {
            TreeMap<Integer,String> tree=new TreeMap<Integer,String>(); //print ascending order by default
            tree.put(1,"apple");
            tree.put(2,"grapes");
            tree.put(3,"pineaple");
            tree.put(4,"papaya");

            System.out.println("descending order: "+tree.descendingMap());
            //Returns key-value pairs whose keys are less than or equal to the specified key.
            System.out.println("headMap: "+tree.headMap(2,true));
            //Returns key-value pairs whose keys are greater than or equal to the specified key.
            System.out.println("tailMap: "+tree.tailMap(2,true));
            //Returns key-value pairs exists in between the specified key.
            System.out.println("subMap: "+tree.subMap(1, true, 2, true));

        }
    }

