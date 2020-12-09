package WhileLoop;

import java.util.Scanner;

public class AskThePrice {
    public static void main(String[] args) {

        // PhonePrice = 500
        // user entered 100
        // please enter 400 more
        // user entered 100
        //please enter 300 more
        //user entered 300
        //here is the phone

        Scanner input = new Scanner(System.in);
        System.out.println("The phone price is $500. Please enter the amount:");
        double userInput = input.nextDouble();

        while (userInput<500){
            double requiredAmount = 500 - userInput;
            System.out.println("Please input: " +requiredAmount);
            userInput+=input.nextDouble();
        }

        double exchange = userInput - 500;
        System.out.println("Here is the phone!  The exchange amount is: "  + exchange);

    }
}
