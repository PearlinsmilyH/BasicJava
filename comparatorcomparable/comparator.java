
import java.util.*;
    class Studen {                                             //class 1
        int rollno;
        String name;
        public Studen(int rollno, String name)   //constructor
        {
            this.rollno = rollno;
            this.name = name;
        }
        public String toString()
        {
            return this.rollno + " " + this.name;
        }
    }
    class Sortbyname implements Comparator<Studen> {           //class 2    comparator interface, sorting in our own way
        public int compare(Studen a, Studen b)                 //comparing
        {
            return a.name.compareTo(b.name);
        }
    }
public class comparator {
        public static void main(String[] args) {
        ArrayList<Studen> stud = new ArrayList<Studen>();

        stud.add(new Studen(001, "Smily"));
        stud.add(new Studen(002, "Blessy"));
        stud.add(new Studen(003, "Jerwin"));
        stud.add(new Studen(004, "Ronald"));
            System.out.println("Students List (Before Sorting):");
            for (Studen student : stud) {
                System.out.println(student);
            }
            Collections.sort(stud, new Sortbyname());
            System.out.println("\nStudents List (After Sorting by name):");
            for (Studen student : stud) {
                System.out.println(student);
            }
        }
}
