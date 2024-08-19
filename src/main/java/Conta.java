public class Conta {
    private double balance;

    public Conta(double balance) {
        this.balance = balance;
    }

    public void deposit(double value) throws Exception {
        if ( value > 0 ) {
            balance += value;
            System.out.println(value + " depositado, o saldo atual é: " + balance);
        } else {
            throw new Exception("O valor deve ser positivo ");
        }
    }

    public void withdrawal(double value) throws Exception {
        if ( value > 0 && value <= balance ) {
            balance -= value;
            System.out.println(balance + " sacado, o saldo atual é: " + balance);
        } else {
            throw new Exception("Valor de saque inválido");

        }
    }

    public double getBalance() {
        return balance;
}
}