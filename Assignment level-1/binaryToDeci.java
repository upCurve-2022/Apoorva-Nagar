import java.util.Scanner;

public class binaryToDeci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String st=sc.next();
        int deci = Integer.parseInt(st,2);
        System.out.println("Decimal output: "+deci);
    }
}
