package WhileLoop;

import java.util.Scanner;

public class SumOfOddNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter starting number:");
        int startingNum = input.nextInt();
        System.out.println("Enter ending number:");
        int endingNum = input.nextInt();
        int sum = 0;

        while (startingNum <=endingNum){

            if (startingNum %2==1){
                sum+=startingNum;
                System.out.print(startingNum + " , ");
            }

            startingNum++;
        }

        System.out.println("Sum of numbers:  "+sum);
    }
}

