public abstract class Mortgage implements MortgageConstants {

    int number;
    String customerName;
    double amountOfMortgage;
    double interestRate;
    String term;
    String type;

    public void setAmountOfMortgage (double amountOfMortgage)
    {
        if (amountOfMortgage > maxMortgage)
        {
            System.out.println("Invalid value. Mortgage amount must be less than: " + maxMortgage);

        }
        else {
            this.amountOfMortgage = amountOfMortgage;
        }
    }

    public void setTerm (String term)
    {
        switch (term.toLowerCase()) {
            case "long":
                this.term = longTerm;
                break;
            case "medium":
                this.term = mediumTerm;
                break;
            case "short":
                this.term = shortTerm;
                break;
            default:
                System.out.println("Invalid term type. Inform long, medium or short");
        }

    }

    public void getMortgageInfo()
    {
        System.out.println("********** Mortage - " + number + " **********");
        System.out.println("");
        System.out.println("Bank Name: " + bank);
        System.out.println("Type: " + type);
        System.out.println("Customer Name: " + customerName);
        System.out.printf("%s %.2f%n","Amount of Mortgage: $", amountOfMortgage);
        System.out.println("Interest rate: " + interestRate + "%");
        System.out.println("Term: " + term);
        System.out.printf("%s %.2f%n", "Total amount owed: $", amountOfMortgage*(1 + interestRate/100));
        System.out.println("");
        System.out.println("************************************");
        System.out.println("");
    }
}

