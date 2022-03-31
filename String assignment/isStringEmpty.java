import java.util.Scanner;

// Write a program to check if the String is Empty in Java
public class isStringEmpty {

    public static boolean isEmpty(String str){
        return str.isEmpty();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = s.nextLine();
        System.out.println("Is string empty: " + isEmpty(str));
    }
}
