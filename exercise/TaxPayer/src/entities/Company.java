package entities;

public class Company extends TaxPayer {

    private int numberOfEmployees;

    public Company(String name, double annualIncome, int numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        double totalTax;

        if (numberOfEmployees >= 10) {
            totalTax = getAnnualIncome() * 0.14;
        } else {
            totalTax = getAnnualIncome() * 0.16;
        }

        return totalTax;
    }
}
