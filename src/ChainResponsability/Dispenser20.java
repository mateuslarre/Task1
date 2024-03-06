package ChainResponsability;

public class Dispenser20 extends DispenseChain {
    @Override
    public void dispense(double amount) {
        if (amount >= 20) {
            double num = amount / 20;
            double remainder = amount % 20;
            System.out.println("Devolvendo " + (int)num + " nota de 20$");
            if (remainder != 0) this.nextChain.dispense(remainder);
        } else {
            this.nextChain.dispense(amount);
        }
    }
}
