import java.util.Scanner;

// Write a program to display the number in following sequence.
//4, 16, 36, 64.......N

public class seq4_16_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num =sc.nextInt();
        int temp=1;
        int res=0;
        int pre=1;
        while (num!=0){
            res=4*pre;
            System.out.print(res+",");
            temp+=2;
            pre+=temp;
            num-=1;

        }

    }
}
