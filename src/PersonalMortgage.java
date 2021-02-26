public class PersonalMortgage extends Mortgage {

    public PersonalMortgage (int number, String customerName,
                             double amountOfMortgage, double currentInterestRate, String term, String type)
    {
        this.number = number;
        this.customerName = customerName;
        setAmountOfMortgage (amountOfMortgage) ;
        this.interestRate = currentInterestRate + 2;
        setTerm (term);
        this.type = type;
    }

}

