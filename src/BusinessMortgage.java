public class BusinessMortgage extends Mortgage {

    public BusinessMortgage (int number, String customerName,
                             double amountOfMortgage, double currentInterestRate, String term, String type)
    {
        this.number = number;
        this.customerName = customerName;
        setAmountOfMortgage (amountOfMortgage);
        this.interestRate = currentInterestRate + 1;
        setTerm (term);
        this.type = type;
    }

}

