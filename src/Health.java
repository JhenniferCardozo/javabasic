public class Health extends Insurance {

    // override abstract method setInsuranceCost in Insurance

    private double insuranceCost;

    public Health (String typeInsurance, double monthlyCost)
    {
        super(typeInsurance, monthlyCost);
    }

    public void setInsuranceCost()
    {
        insuranceCost = 12 * getMonthlyCost();
    }

    public String displayInfo()
    {
        return "Insurance Type: " + getTypeInsurance() + "  Yearly Insurance Cost: $" + insuranceCost;
    }
}

