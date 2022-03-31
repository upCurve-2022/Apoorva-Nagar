import java.util.Scanner;

// Write a program to reverse the number.
public class reverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int rem = 0;
        int rev = 0;

        while (num!=0){
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }

        System.out.println("Reverse of the number: "+rev);

    }
}
