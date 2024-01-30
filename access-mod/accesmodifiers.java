public class accesmodifiers
{ public static String companyname="zoho";
        private static int salary= 20000; //private modifier which is only accessed within the class
        public static void main(String[] args) //public modifier which is only accessed
                                               //protected modifier which is used in inheritence to access the variables of other subclass
                                               //default modifier which is public is used when no modifier is mentioned
    {
        System.out.println(companyname);
        System.out.println(salary);
    }
}
