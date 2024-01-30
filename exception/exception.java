public class exception {
    public static void main(String[] args) {
        int a = 56;
        int b = 0;
        try {
            System.out.println(a / b);               /*we know that any number divided by 0 gives an error
                                                     which terminate the program without executing the "finally" block.
                                                      so we throw it to the compiler*/
        } catch (Exception E) {                       /*if we know the correct exception name (eg. ArithmeticException)
                                                      then use the correct exception name otherwise simply use "Exception"*/

            System.out.println("a/b is 0");        /*but the catch section catch that exception and print some
                                       temporary sentence to avoid the program to get terminated abnormally
                                                       ie) without executing the "finally" block*/
        } finally {
            System.out.println("after executing the exception");
        }
    }
}

