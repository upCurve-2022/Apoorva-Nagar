// Write a program to demonstrate ways to compare two Strings in Java

public class compareStrings {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello world";
        Object strObj = str1;
        System.out.println(str1.compareTo(str2) );
        System.out.println(str1.compareToIgnoreCase(str2) );
        System.out.println(str1.compareTo(strObj.toString()));
    }
}
