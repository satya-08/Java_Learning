package solidPrinciples.O_OpenClosed;

public class NetBanking implements PaymentService {
    @Override
    public void processPayment() {
        System.out.println("NetBanking process payment");
    }
}
