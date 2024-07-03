public class Main {
    public static void main(String[] args) {
        TaxCalculator usaTaxCalculator = new TaxCalculator(new USATaxStrategy());
        TaxCalculator ukTaxCalculator = new TaxCalculator(new UKTaxStrategy());

        double taxUSA = usaTaxCalculator.calculateTax();
        double taxUK = ukTaxCalculator.calculateTax();

        System.out.println("Tax in USA: " + taxUSA);
        System.out.println("Tax in UK: " + taxUK);
    }
}