import java.util.Scanner;

public class swap3Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 values for a,b,c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        a = a + b + c;
        b = a - b - c;
        c = a - b - c;
        a = a - b - c;
        System.out.println("After Swapping: ");
        System.out.println("a :" +a);
        System.out.println("b :" +b);
        System.out.println("c :" +c);
    }
}
