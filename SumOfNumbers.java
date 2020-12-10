package WhileLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter starting number:");
        int startingNum = input.nextInt();
        System.out.println("Enter ending number:");
        int endingNum = input.nextInt();
        int sum = 0;

        while (startingNum <=endingNum){

            sum+=startingNum;
            System.out.print(startingNum + " , ");
            startingNum++;
        }

        System.out.println("Sum of numbers:  "+sum);


    }
}
