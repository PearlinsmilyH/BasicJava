abstract class ani                                   //abstract class
{
    public abstract void cat ();                     //abstract method
}
class abst1 extends ani
{
    public void cat (){
        System.out.println("meoww");
}
    public void sleepy()
        {
            System.out.println("zzz");
        }
}
public class abst
{
    public static void main(String[] args)
    {
        abst1 obj1=new abst1();
        obj1.cat();
        obj1.sleepy();

    }
}
