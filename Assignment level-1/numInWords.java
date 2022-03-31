import java.util.Scanner;

public class numInWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String s = Integer.toString(num);

        for (int ind = 0; ind < s.length(); ind++) {
            char ch = s.charAt(ind);
            if (ch == '1')
                System.out.print("One ");
            else if (ch == '2')
                System.out.print("Two ");
            else if (ch == '3')
                System.out.print("Three ");
            else if (ch == '4')
                System.out.print("Four ");
            else if (ch == '5')
                System.out.print("Five ");
            else if (ch == '6')
                System.out.print("Six ");
            else if (ch == '7')
                System.out.print("Seven ");
            else if (ch == '8')
                System.out.print("Eight ");
            else if (ch == '9')
                System.out.print("Nine ");
            else if (ch == '0')
                System.out.print("Zero");
        }
    }
}
