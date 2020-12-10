package WhileLoop;

public class EvenNumber {

    public static void main(String[] args) {
        int num = 20;

        while (num <= 40){
            if (num%2==0){
                System.out.println(num);
                num++;
            }
        }

        System.out.println(num);
    }
}
