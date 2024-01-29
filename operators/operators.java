public class operators {
    public static void main(String[] args){
//1.arithmetic operators (which performs some operations between any values)
        System.out.println("\n1.Arithmetic operations\n");
        int x = 5;
        int y = 3;
        System.out.println(x + y);   // addition
        System.out.println(x - y);   // subtraction
        System.out.println(x * y);   // multiplication
        System.out.println(x / y);   // division
        System.out.println(x % y);   // modulus..which gives remainder
        System.out.println(++x);    // increment..which increase the value with 1
        System.out.println(--y);    // decrement..which decrease the value with 1

//2.assignment operators (which assigns the value to any variable)
        System.out.println("\n2.Assignment operators\n");
        int z = 5;
        System.out.println("z="+z);     // equal to..which assigns the value 5 in z
        z += 10;                   // which adds 10 with 5
        System.out.println("z+="+z);
        z -= 2;
        System.out.println("z-="+z);    // now z=15, after doing -=2 operations, z becomes 13.
        z *= 2;
        System.out.println("z*="+z);    // multiplies 2 with z and assigns the answer in z.
        z /=2;
        System.out.println("z/="+z);    // which divides the z with 13 and assigns the value in z. now z=13.
        z %=5;
        System.out.println("z%="+z);    // which gives remainder
        z &=6;
        System.out.println("z&="+z);    // it multiplies the binary values and assigns the answer in decimal value.
        z |=3;
        System.out.println("z|=\n"+z);    //it adds the binary values [binary value of 2 is 10; binary value of 3 is 11, then the answer is 11 i.e) 3] and assigns the answer in decimal format

//3. Comparison operators
        System.out.println("\n3.Comparison operators\n");
        int a = 10;
        int b = 20;
        System.out.println("a == b\t"+(a == b));
        System.out.println("a!=b\t"+(a!=b));
        System.out.println("a<b\t"+(a<b));
        System.out.println("a>b\t"+(a>b));
        System.out.println("a<=b\t"+(a<=b));
        System.out.println("a>=b\t"+(a>=b));

//4. Logical operators
        System.out.println("\n4. logical operators\n");

        int c = 5;
        System.out.println(c>6 && c<9);
        System.out.println(c > 3 || c < 6);
        System.out.println(!(c>6));

    }
}
