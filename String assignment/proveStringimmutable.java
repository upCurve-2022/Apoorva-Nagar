// Write a program to prove String is immutable.

public class proveStringimmutable {
    public static void checkReference(Object x, Object y){
        if (x == y){
            System.out.println("Both point to the same reference");
        }
        else {
            System.out.println("Both point to different references");
        }
    }
    public static void main(String[] args) {
        String str1 = "Harry";
        String str2 = "Harry";
        System.out.println("Before modification to string 1: ");
        checkReference(str1, str2);
        str1 += "Potter";
        System.out.println("After modification to string 1: ");
        checkReference(str1, str2);
    }
}
