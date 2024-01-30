
    import java.util.*;
    class Linkedhashmap{
        public static void main(String args[]){
            LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
            map.put(100,"Amit");
            map.put(101,"Vijay");
            map.put(102,"Rahul");

            System.out.println("Keys: "+map.keySet()); //print only key value
            System.out.println("Values: "+map.values()); // print only value
            System.out.println("Key-Value pairs: "+map.entrySet()); //print both
            map.remove(102);
            System.out.println("removing 102: "+map);
        }
    }

