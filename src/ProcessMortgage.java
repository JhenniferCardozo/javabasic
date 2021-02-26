import java.util.Scanner;

public class ProcessMortgage {

    public static void main(String[] args) {

        Mortgage[] mortgageArray = new Mortgage[3];
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter (%) Current Interest rate: ");
        double currentInterestRate = input.nextDouble();
        System.out.println("");System.out.println("");

        for (int i = 0; i < mortgageArray.length; i++ )
        {
            System.out.print("Please enter Mortgage Type (Personal or Business): ");
            input.nextLine();
            String type = input.nextLine();

            System.out.print("Please enter Mortgage Number: ");
            int number = input.nextInt();

            System.out.print("Please enter Customer Name: ");
            input.nextLine();
            String customerName = input.nextLine();

            System.out.print("Please inform Term (short, medium or long): ");
            String term = input.nextLine();

            System.out.print("Please enter Amount of Mortgage: ");
            double amountOfMortgage = input.nextDouble();

            //Array
            if(type.toLowerCase().equals("personal"))
            {
                mortgageArray[i] = new PersonalMortgage(number, customerName,
                        amountOfMortgage, currentInterestRate, term, type);
            }
            else if (type.toLowerCase().equals("business"))
            {
                mortgageArray[i] = new BusinessMortgage(number, customerName,
                        amountOfMortgage, currentInterestRate, term, type);
            }

            System.out.println("");System.out.println("");
        }

        for (Mortgage currentMortgage : mortgageArray)
        {
            currentMortgage.getMortgageInfo();
        }

        input.close();
    }


}

