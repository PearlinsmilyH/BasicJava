import java.util.*;
public class Streams
{
    public static void main(String[] args)     /*stream is used to process the collection of objects.
                                                 if we change the values of stream it will not affect the original values in list.
                                                 once we use this stream it cannot be reuse.*/

    {
        List<Integer> nums = Arrays.asList(2,9,3,8,4,7,5);   //list
        nums.stream()
                .filter(n -> n%2==1)                        //print the odd numbers
                .sorted()                                   //and sorted in ascending order
                .map(n -> n*2)                              //and double it
                .forEach(n -> System.out.println(n));       //and print the values through for-each loop.

    }
}
