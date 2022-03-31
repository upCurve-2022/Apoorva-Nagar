import java.util.Scanner;

// Write a program to remove all occurrences of a given character from input String:
public class deleteOccurences {

    public static void main(String[] args) {
        String strToDelete;
        char deleteChar;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:  ");
        strToDelete = sc.nextLine();

        System.out.print("Enter a character to Delete:  ");
        deleteChar = sc.next().charAt(0);

        String del = strToDelete.replace(deleteChar, Character.MIN_VALUE);
        System.out.println("Final string after deleting character " + deleteChar + " is " + del);
    }
}
