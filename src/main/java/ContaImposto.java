public class ContaImposto extends Conta {
    private double taxPercentual;

    public ContaImposto(double balance, double taxPercentual) {
        super(balance);
        this.taxPercentual = taxPercentual;
    }

    public void taxCalculator() throws Exception {
        double tax = getBalance() * taxPercentual / 100;
        withdrawal(tax);
        System.out.println("Saldo após imposto: " + getBalance());
}

}