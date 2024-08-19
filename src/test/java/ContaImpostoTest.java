import org.junit.Assert;
import org.junit.Test;

public class ContaImpostoTest {

    @Test
    public void depoistTest() throws Exception {
        Conta conta = new Conta(1250);
        conta.deposit(95);
        Assert.assertEquals(1345, conta.getBalance(), 0.001);
    }

    @Test
    public void withdrawalTest() throws Exception {
        Conta conta = new Conta(1250);
        conta.withdrawal(500);
        Assert.assertEquals(750, conta.getBalance(), 0.001);
    }

    @Test
    public void invalidWithdrawalTest() throws Exception {
        Conta conta = new Conta(1250);
        ContaImposto contaimposto = new ContaImposto(1250,15);
        contaimposto.deposit(150);
        Assert.assertEquals(1400, contaimposto.getBalance(), 0.001);
    }

    @Test
    public void taxCalculatorTest() throws Exception {
        ContaImposto contaImposto = new ContaImposto(1250, 35);
        contaImposto.taxCalculator();
        Assert.assertEquals(812.5, contaImposto.getBalance(), 0.001);
    }

    @Test
    public void insufficientBalanceTaxCalculator() throws Exception {
        ContaImposto contaImposto = new ContaImposto(1250, 45);
        contaImposto.taxCalculator();
        Assert.assertEquals(687.5, contaImposto.getBalance(), 0.001);
}

}