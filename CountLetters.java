package WhileLoop;

        import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter String value:");
        String name = input.nextLine();

        int index = 0;

        //While index is less than last index number run the while loop
        // and use this index number to print the letters inside the loop

        while (index <name.length()) {
            //System.out.println(index);   // counted  length
            System.out.println(name.charAt(index));  // counted letter
            index++;
        }

        System.out.println("Last Char to First Char");

        int indexNum = name.length()-1;

        while (indexNum >=0){
            System.out.println(name.charAt(indexNum));
            indexNum--;


        }




    }
}
