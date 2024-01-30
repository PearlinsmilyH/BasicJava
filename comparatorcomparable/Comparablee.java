import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Students implements Comparable<Students> {             //comparable interface
    int rollNo;
    String name;
    public Students(int rollNo, String name)                //constructor
    {
        this.rollNo=rollNo;
        this.name=name;
    }

    public int compareTo(Students otherStudents) {         //for sorting
        return this.rollNo - otherStudents.rollNo;
    }
    public String toString() {
        return this.rollNo + " " + this.name;
    }
}
public class Comparablee {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students(3, "Alice"));
        students.add(new Students(1, "Bob"));
        students.add(new Students(2, "Charlie"));

        System.out.println("Students List (Before Sorting):");
        for (Students student : students) {
            System.out.println(student);
        }
        Collections.sort(students);

        System.out.println("\nStudents List (After Sorting by Roll Number):");
        for (Students student : students) {
            System.out.println(student);
        }
    }
}

