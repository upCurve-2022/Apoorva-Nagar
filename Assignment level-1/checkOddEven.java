import java.util.Scanner;

public class checkOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(num%2==0? "number is even": "number is odd");
    }
}
