public class staticblock {
    static int i;                //static variable
    int j;
static {
    i = 50;                       // static block which called the static variable
}
}
class sb{
    public static void main(String[] args)
{
    System.out.println(staticblock.i);
}
}


