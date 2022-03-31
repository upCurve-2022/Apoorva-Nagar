import java.util.Scanner;

// Write a simple Program to calculate the Simple Interest.
public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount= sc.nextInt();

        System.out.print("Enter time-period (in years): ");
        int time = sc.nextInt();

        System.out.print("Enter interest rate: ");
        int rate = sc.nextInt();

        System.out.println("Simple Interest: "+ (amount * time * rate)/100);
    }
}
