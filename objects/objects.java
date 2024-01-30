public class objects
{
    public static void main(String[] args){
        Student s1=new Student();
        s1.id=006;
        s1.salary=10000;
        s1.name="Smily";

        System.out.println(s1.id+" "+s1.name+" "+s1.salary);
    }
}
class Student{                  //class and objects
        int id;
        float salary;
        String name;
    }

