import java.util.Scanner;

public class numPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Enter power value:");
        int pow = sc.nextInt();
        int res = 1;
        for (int i =0; i<pow ;i++){
            res *= num;
        }
        System.out.println("Answer"+res);
    }
}
