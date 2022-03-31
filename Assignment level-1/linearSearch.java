import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number to be searched: ");
        int search = sc.nextInt();
        int[] arr = {2, 12, 4, 27, 23, 10, 3, 8, 1};

        int temp = 0;

        for (int i=0;i<arr.length;i++){
            if (arr[i] == search){
                temp = 1;
                break;
            }
        }
        if(temp == 1)
            System.out.println("Number found ");
        else
            System.out.println("Number not found");
    }
}
