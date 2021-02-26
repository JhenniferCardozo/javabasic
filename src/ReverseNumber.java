import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args)
    {
        //Create an object to accept input from user.
        Scanner input = new Scanner(System.in);

        //Input from user.
        System.out.print("Please, enter the number: ");
        int entryNum = input.nextInt();
        int result = reverse(entryNum);

        //Print result.
        System.out.println("The number " + entryNum + " reversed is: " + result);

        //Close scanner.
        input.close();
    }

    //Method to reverse.
    public static int reverse(int n)
    {
        int result = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            n = n / 10;
            result = result * 10 + rem;
        }
        return result;
    }

}
