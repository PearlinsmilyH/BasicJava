public class Variables {
    int a;                                                        //instsnace variable
    static String b;                                               //static variable

    public static void main(String[] args) {
        int c =10;                                                  //local variable
        System.out.println("Rollno=" +c);
        Variables obj1 = new Variables();
        obj1.a=5;
        obj1.b="smily";
        System.out.println("Age: "+obj1.a +"   " +"Name: "+obj1.b);



    }
}

