import java.util.*;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i=0; i<num ; i++){

            for (int j =num-i; j > 1; j--){
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
