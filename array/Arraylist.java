import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
    public static void main(String[] args) {
        {
            ArrayList<Integer> numbers = new ArrayList<Integer>();           //array
            numbers.add(78);
            numbers.add(90);
            numbers.add(56);
            numbers.add(45);
            numbers.add(67);
            numbers.add(23);
            numbers.add(42);
            numbers.add(12);
            numbers.add(3);
            System.out.println(numbers);
        }
        {
            ArrayList<String> names = new ArrayList<String>();
            names.add("smily");
            names.add("Blessy");
            names.add("Jerwin");
            for (String i : names)
                System.out.println(i);
        }
        {
            ArrayList<Integer> myNumbers = new ArrayList<Integer>();
            myNumbers.add(33);
            myNumbers.add(15);
            myNumbers.add(20);
            myNumbers.add(34);
            myNumbers.add(8);
            myNumbers.add(12);
            Collections.sort(myNumbers);                           //print the valus in ascending order
            for (int j : myNumbers) {
                System.out.println(j);
            }
        }
    }
}

