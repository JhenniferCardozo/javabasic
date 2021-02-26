import java.util.Scanner;

public class TestInsurance {
    public static void main(String[] args) {

        // Create an object to accept input from user
        Scanner input = new Scanner(System.in);

        // Input from user
        System.out.print("Please enter the number of insurances: ");
        int number = input.nextInt();

        // Create an array
        Insurance[] arrayInsurance = new Insurance[number];

        for (int i = 0; i < number; i++) {

            // Input from user
            System.out.print("Please enter the insurance type (Health or Life): ");
            String type = input.next();

            System.out.print("Please enter the monthly fee: ");
            Double fee = input.nextDouble();

            // Create object according insurance type
            if (type.toLowerCase().equals("health")) {
                Insurance insurance = new Health("health", fee);
                arrayInsurance[i] = insurance;
            } else if (type.toLowerCase().equals("life")) {
                Insurance insurance = new Life("life", fee);
                arrayInsurance[i] = insurance;
            }
        }
        // Display insurance information
        System.out.println("");
        int counter = 1;
        for (Insurance displayInsurance : arrayInsurance) {
            displayInsurance.setInsuranceCost();
            System.out.printf("[%s%d] %s", "Insurance ", counter, displayInsurance.displayInfo());
            counter++;
            System.out.println("");
        }

        // Close scanner.
        input.close();

    }

}
