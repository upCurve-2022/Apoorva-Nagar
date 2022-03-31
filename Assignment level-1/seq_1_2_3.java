import java.util.Scanner;

// Write a program to display the number in following sequence.
//-1, 2, -3, 4, -5........N
public class seq_1_2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean temp = false;
        for (int i=1;i<=num;i++){
            if ( temp == false)
                System.out.print(-1*i+",");
            else
                System.out.print(i+",");
            temp =! temp;
        }
    }
}
