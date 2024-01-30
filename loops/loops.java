import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // if statement
        System.out.println("---if stmt---\t");
        if (45 > 20) {
            System.out.println("45 is greater than 20\n");
        }
        //if else statement
        {
            System.out.println("---if else stmt---\t");
            int x;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter x");
            x = sc.nextInt();

            if (x % 2 == 0)
                System.out.println("it is even number");
            else
                System.out.println("it is odd number");
        }
        //else if statement
        {
            System.out.println("---else if stmt---\t");
            int y;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter mark;");
            y = sc.nextInt();

            if (y < 35)
                System.out.println("Fail");
            else if (y >= 35 && y < 80)
                System.out.println("A");
            else if (y > 80 && y < 90)
                System.out.println("A+");
            else if (y >= 90 && y <= 100)
                System.out.println("O");
            else
                System.out.println("Error");
        }
        //while loop
        {
            System.out.println("---while loop---\t");
            int z = 0;
            while (z < 5) {
                System.out.println(z);
                z++;
            }
        }

        //dowhile loop
        {
            System.out.println("---do while loop---\t");
            int i = 10;
            do {
                System.out.println(i);
                i++;
            }
            while (i < 15);
        }
            //for loop
        {
            System.out.println("---for loop---\t");
            for (int j = 20; j <= 30; j = j + 2) {
                System.out.println(j);
            }
        }
        //break
        System.out.println("---break---\t");
        for (int k = 0; k < 10; k++) {
            if (k == 4) {
                break;
            }
            System.out.println(k);
        }
        //continue
        System.out.println("---continue---\t");
        for (int l = 50; l < 60; l++) {
            if (l == 54) {
                continue;
            }
            System.out.println(l);
        }
    }
}
