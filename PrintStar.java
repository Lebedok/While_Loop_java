package WhileLoop;

public class PrintStar {
    public static void main(String[] args) {
        /*

               *
               * *
               * * *
               * * * *
               * * * * *

        the loop will run 5 times and will print the stars in given format
         */

        String star = "*";
        int num = 1;

        while (num<=5){
            System.out.println(star);
            star = star.concat("*");
            num ++;

        }

    }
}
