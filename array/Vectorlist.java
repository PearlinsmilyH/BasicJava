import java.util.*;
    public class Vectorlist
    {
        public static void main(String args[])
        {
            Vector<String> vec = new Vector<String>();
            vec.add("Smily");
            vec.add("blessy");
            vec.add("joha");
            vec.add("pearlin");
            vec.add("joe");
            vec.add("anu");
            vec.add("kabi");
            Collections.sort(vec);

            for (String i: vec)
            {
                System.out.println(i);
            }
        }
    }

