import java.util.Scanner;

public class CalculatorProduct {
    public static void main(String[] args) {
        //Create an object to accept input from user.
        Scanner input = new Scanner(System.in);

        //Input from user.
        System.out.print("Please, enter first number: ");
        int firstNum = input.nextInt();
        System.out.print("Please, enter second number: ");
        int secondNum = input.nextInt();
        System.out.print("Please, enter third number: ");
        int thirdNum = input.nextInt();

        //Calculate product.
        int result = firstNum * secondNum * thirdNum;

        //Print result.
        System.out.printf("The product of %d, %d and %d is %d.%n"
                , firstNum, secondNum, thirdNum, result);

        //Close scanner.
        input.close();
    }
}
