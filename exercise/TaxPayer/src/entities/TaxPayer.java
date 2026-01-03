package entities;

public abstract class TaxPayer {

    private String name;
    private double AnnualIncome;

    protected TaxPayer(String name, double annualIncome) {
        this.name = name;
        AnnualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnnualIncome() {
        return AnnualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        AnnualIncome = annualIncome;
    }

    public abstract double tax();
}
