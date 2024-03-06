package ChainResponsability;

public class Cent50Dispenser extends DispenseChain {
    @Override
    public void dispense(double amount) {
        if (amount >= 0.5) {
            double num = amount / 0.5;
            double remainder = amount % 0.5;
            System.out.println("Devolvendo " + (int)num + " moeda de 50 centavos");
            if (remainder != 0) this.nextChain.dispense(remainder);
        } else {
            this.nextChain.dispense(amount);
        }
    }
}
