import java.util.*;
public class Linkedlist{
        public static void main(String args[]){

            LinkedList<String> a=new LinkedList<String>();
            a.add("car");
            a.add("bike");
            a.add("lorry");
            a.add("train");

            Iterator<String> b=a.iterator();
            while(b.hasNext()){
                System.out.println(b.next());
            }
        }
    }
