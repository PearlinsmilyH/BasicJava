 interface detail1
     {
         public void stud1();
         String name1 = "Smily";
         int age1 = 24;
     }
 interface detail2
 {
     public void stud2();
     String name2 ="blessy";
     int age2 = 27;
 }
 class alldetails implements detail1,detail2 {
     public void stud1() {
         System.out.println("Student 1 Name:" + name1 +" age:" + age1);
     }

     public void stud2() {
         System.out.println("Student 2 Name:" + name2 + " age:" + age2);
     }
 }

     public class Interface {
         public static void main(String[] args)
         {
             alldetails obj1 =new alldetails();
             obj1.stud1();
             obj1.stud2();
         }
     }

