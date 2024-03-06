package ChainResponsability;

public class ATMDispenseChain {
    private DispenseChain c1;
    public ATMDispenseChain() {
        this.c1 = new Dispenser50();
        DispenseChain c2 = new Dispenser20();
        DispenseChain c3 = new Dispenser10();
        DispenseChain c4 = new Dispenser2();
        DispenseChain c5 = new Cent50Dispenser();
        DispenseChain c6 = new Cent25Dispenser();
        c1.setNextChain(c2);
        c2.setNextChain(c3);
        c3.setNextChain(c4);
        c4.setNextChain(c5);
        c5.setNextChain(c6);
    }
    public void dispense(double amount) {
        c1.dispense(amount);
    }
}

