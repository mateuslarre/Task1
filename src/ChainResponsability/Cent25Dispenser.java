package ChainResponsability;

public class Cent25Dispenser extends DispenseChain {
    @Override
    public void dispense(double amount) {
        if (amount >= 0.25) {
            double num = amount / 0.25;
            double remainder = amount % 0.25;
            System.out.println("Devolvendo " + (int)num + " moeda de 25 centavos");
            if (remainder != 0) this.nextChain.dispense(remainder);
        } else {
            this.nextChain.dispense(amount);
        }
    }
}
