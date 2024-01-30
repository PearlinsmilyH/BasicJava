public class methodoverloading
    {
        static int add(int x, int y)
        {
        return x + y;
        }

        static float add(float x, float y)
        {
        return x + y;
        }

    public static void main(String[] args) {
        System.out.println(add(5, 3));
        System.out.println(add(4.5f, 5.4f));
    }
}