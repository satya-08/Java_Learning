package solidPrinciples.L_LiskovSubstitution;

public class CreditCard implements PaymentService{
    @Override
    public void pay() {
        System.out.println("Credit Card Payment");
    }

    @Override
    public void refund() {
        System.out.println("Money Refund process");
    }
}
