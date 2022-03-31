import java.util.Scanner;

public class seq1_4_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num=sc.nextInt();
        int i=1;
        while (i!=num+1){
            System.out.print((int) Math.pow(i,i)+",");
            i+=1;
        }
    }
}
