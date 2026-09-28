package DesignPatterns.solidPrinciples.L_LiskovSubstitution;

public class Crypto implements PaymentService{
    @Override
    public void pay() {
        System.out.println("Crypto Service");
    }

    @Override
    public void refund() {
//        System.out.println("Refund Money");
        throw new UnsupportedOperationException("Refund not Supported");
    }
}
