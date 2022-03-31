import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String s = "";

        for (int i = 1; i <= num; i++) {
            s += "* ";
            System.out.println(s);
        }
    }
}
