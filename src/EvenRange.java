import java.util.Scanner;
public class EvenRange {
    public static void main(String[] args)
    {
        //Create an object to accept input from user.
        Scanner input = new Scanner(System.in);

        //Input from user.
        System.out.print("Please, enter a number to determine if it is even or not "
                + "and see the reference number: ");
        int num = input.nextInt();
        boolean isEven = evenOdd(num);
        int result = checkNum(num);

        //Close scanner.
        input.close();

        //Print result.
        System.out.println();
        System.out.println("The number " + num + " is even? "+ isEven);
        System.out.println();
        System.out.println("*** Reference Number   ***");
        System.out.println("*** Between 90-100 = 4 ***");
        System.out.println("*** Between 80-89  = 3 ***");
        System.out.println("*** Between 70-79  = 2 ***");
        System.out.println("*** Between 60-69  = 1 ***");
        System.out.println("*** Lower than 60  = 0 ***");
        System.out.println("**************************");
        System.out.println();
        if(num <= 100)
            System.out.println("The number " + num + " is referent to "+ result);
        else {
            System.out.println("The number is more than 100. ");
        }

    }

    //method to check if is even
    public static boolean evenOdd(int num) {
        return num % 2 == 0;
    }

    //method to see result
    public static int checkNum(int num) {

        int result = -1;

        if(num>=90 && num<=100)
            result = 4;
        else if(num>=80 && num<=89)
            result = 3;
        else if(num>=70 && num<=79)
            result = 2;
        else if(num>=60 && num<=69)
            result = 1;
        else if(num<60)
            result = 0;
        return result;
    }

}
