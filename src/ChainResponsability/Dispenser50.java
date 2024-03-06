package ChainResponsability;

public class Dispenser50 extends DispenseChain {
    @Override
    public void dispense(double amount) {
        if (amount >= 50) {
            double num = amount / 50;
            double remainder = amount % 50;
            System.out.println("Devolvendo " + (int)num + " nota de 50$");
            if (remainder != 0) this.nextChain.dispense(remainder);
        } else {
            this.nextChain.dispense(amount);
        }
    }
}
