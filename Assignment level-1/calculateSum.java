import java.util.Scanner;
// Write a program to calculate the sum of
//(a) Odd numbers from 1- N.
//(b) Even numbers from 0 – N.

public class calculateSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int odd = 0;
        for (int i=1; i<=num; i+=2){
            odd += i;
        }

        int even = 0;
        for (int i=0; i<=num ;i+=2){
            even += i;
        }
        System.out.println("Sum of N odd number: "+ odd);
        System.out.println("Sum of N even number :"+ even);
    }
}
