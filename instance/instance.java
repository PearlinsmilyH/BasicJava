public class instance {
    public String name;
    public int age;

public instance(String sname, int sage)
{
    name = sname;
    age = sage;

}
    public void printstud() {
        System.out.println("Student Name: " + name);
        System.out.println("Age:"+ age);
    }
    public static void main(String args[])
    {
        instance s = new instance("Monica", 15);
        s.printstud();
    }
}


