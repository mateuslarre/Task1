package ChainResponsability;

public class Dispenser10 extends DispenseChain {
    @Override
    public void dispense(double amount) {
        if (amount >= 10) {
            double num = amount / 10;
            double remainder = amount % 10;
            System.out.println("Devolvendo " + (int)num + " nota de 10$");
            if (remainder != 0) this.nextChain.dispense(remainder);
        } else {
            this.nextChain.dispense(amount);
        }
    }
}
