public abstract class Insurance {

    private String typeInsurance;
    private Double monthlyCost;

    // constructor
    public Insurance(String typeInsurance, Double monthlyCost) {
        this.typeInsurance = typeInsurance;
        this.monthlyCost = monthlyCost;
    }

    // return type Insurance
    public String getTypeInsurance() {
        return typeInsurance;
    }

    // return monthly cost
    public Double getMonthlyCost() {
        return monthlyCost;
    }

    // abstract methods must be overridden by concrete subclasses
    public abstract void setInsuranceCost();

    public abstract String displayInfo();

}

