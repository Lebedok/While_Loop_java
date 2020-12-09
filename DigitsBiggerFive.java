package WhileLoop;

import java.util.Scanner;

public class DigitsBiggerFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number:");
        int userNumber = input.nextInt();
        int sum = 0;


        while (userNumber>0){
            int digit = userNumber%10;

            if (digit>5){
                sum +=digit;
            }
            System.out.println(digit);
            userNumber/=10;
        }

        System.out.println(sum);


    }
}
