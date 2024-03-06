package ChainResponsability;

public class Dispenser2 extends DispenseChain {
    @Override
    public void dispense(double amount) {
        if (amount >= 2) {
            double num = amount / 2;
            double remainder = amount % 2;
            System.out.println("Devolvendo " + (int)num + " nota de 2$");
            if (remainder != 0) this.nextChain.dispense(remainder);
        } else {
            this.nextChain.dispense(amount);
        }
    }
}
