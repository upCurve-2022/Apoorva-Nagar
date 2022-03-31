import java.util.Scanner;

// Write a program to check if a String contains only digits?
public class isDigits {
    public static boolean isStrDigits(String str){
        return str.matches("[0-9]+");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Does the string contains only digits: "+isStrDigits(str));
    }
}
