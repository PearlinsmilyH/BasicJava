import java.util.*;
public class Normalloops
{
    public static void main(String[] args)
    {
        List<String> fruits = Arrays.asList("apple", "banana", "orange");    //Collection
        for (int i = 0; i < fruits.size(); i++)                              //using normal loop
        {
            System.out.println(fruits);
            System.out.println(fruits.size());
        }
    }
}
