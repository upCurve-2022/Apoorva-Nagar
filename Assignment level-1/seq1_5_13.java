import java.util.Scanner;

// Write a program to display the number in following sequence.
//1, 5, 13, 29, 49, 77 .............. N
public class seq1_5_13 {
    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n=1;
        int b;
        int res;
        while ( n!=num+1 ){
            int a=3*(n-1)*(n-1);
            if (n%2==0)
                b=(3+(1))/2;
            else
                b=(3-1)/2;
            res=a+b;
            System.out.print(res+ " ,");
            n+=1;
        }
    }
}
