public class Polymorphism
{
    public static void main(String[] args)
    {
        Func obj1 = new Func();
        obj1.min(2, 6);
        obj1.min(10, 9, 8);
    }

}
class Func {
    void min(int a, int b) {
        if (a < b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    void min(int a, int b, int c)
    {
        if (a < b) {
            System.out.println(a);
        } else if (a < c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}

