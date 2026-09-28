package DesignPatterns.solidPrinciples.L_LiskovSubstitution;

public class UPI implements PaymentService{
    @Override
    public void pay() {
        System.out.println("UPI payment Service");
    }

    @Override
    public void refund() {
        System.out.println("Money Refund ");
    }

    public void checkBalance(){
        System.out.println("Checking Bank Balance");
    }
}
