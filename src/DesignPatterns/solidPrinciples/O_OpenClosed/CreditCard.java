package solidPrinciples.O_OpenClosed;

public class CreditCard implements PaymentService {
    @Override
    public void processPayment() {
        System.out.println("Credit Card Service Payment");
    }
}
