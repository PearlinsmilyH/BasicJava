public class staticmethod {
        static String Sub ="Maths";                             //static member (static variable)
        public static int add(int a, int b)                    //static method
        {
            return a + b;
        }
        public static int subtract(int a, int b)
        {
            return a - b;
        }
        public static void main(String[] args)
        {
            System.out.println(staticmethod.Sub);
            int a = 10;
            int b = 5;
           int sum= staticmethod.add(a, b);
            int difference = staticmethod.subtract(a, b);
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);

        }
    }

