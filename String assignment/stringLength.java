import java.util.Scanner;

public class stringLength {
    public static int calcLength(String s){
        int len = 0;
        while (true){
            try{
                char ch = s.charAt(len);
                len++;
            }
            catch (Exception e){
                return len;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("String length: "+calcLength(str));

    }
}
