package entities;

public class Individual extends TaxPayer {

    private double healthExpense;

    public Individual(String name, double annualIncome, double healthExpense) {
        super(name, annualIncome);
        this.healthExpense = healthExpense;
    }

    public double getHealthExpense() {
        return healthExpense;
    }

    public void setHealthExpense(double healthExpense) {
        this.healthExpense = healthExpense;
    }

    @Override
    public double tax() {
        double totalTax;

        if (getAnnualIncome() < 20000.00) {
            totalTax = getAnnualIncome() * 0.15;
        } else {
            totalTax = getAnnualIncome() * 0.25;
        }

        totalTax -= healthExpense * 0.50;

        if (totalTax < 0) {
            totalTax = 0;
        }

        return totalTax;
    }
}

