
class pc
    {
        String name;
        int age;
       public pc (String n, int a)
        {
            name = n;
            age = a;
        }
        public static void main(String[] args)
        {
            pc obj1 = new pc("smily", 25);
            System.out.println(obj1.name+obj1.age);
        }
    }


