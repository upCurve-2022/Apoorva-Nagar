// Write a program to separate the Whole number and Fraction value from double and store
// it in separate variables.

import java.util.Scanner;

public class separateNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float num = sc.nextFloat();

        int deci = (int) num;
        int count = 0;
        for (int i=0; ;i++){
            if (num == (int)num)
                break;
            else
                num *= 10;
            count += 1;
        }


        int frac = (int) (num-(deci*Math.pow(10,count)));
        System.out.println("Whole number: "+deci);
        System.out.print("Fractional part: "+frac);
    }
}
