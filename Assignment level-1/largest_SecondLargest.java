import java.util.Scanner;

// Write a Program to find the largest and second largest of 3 numbers.

public class largest_SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers a,b,c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " is largest");
            if (b > c)
                System.out.println(b + " is second largest");
            else
                System.out.println(c + " is second largest");
        } else if (b > c) {
            System.out.println(b + " is largest");
            if (a > c)
                System.out.println(a + " is second largest");
            else
                System.out.println(c + " is second largest");
        } else {
            System.out.println(c + " is largest");
            if (b > a)
                System.out.println(b + " is second largest");
            else
                System.out.println(a + " is second largest");
        }

    }
}
