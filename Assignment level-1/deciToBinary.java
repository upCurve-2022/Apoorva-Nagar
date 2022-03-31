import java.util.Scanner;

public class deciToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num = sc.nextInt();
        System.out.println("Binary output :"+Integer.toBinaryString(num));
    }
}
