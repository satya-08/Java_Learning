package DesignPatterns.solidPrinciples.O_OpenClosed;

public class UPIService implements PaymentService {
    @Override
    public void processPayment() {
        System.out.println("UPI Service Payment");
    }
}
