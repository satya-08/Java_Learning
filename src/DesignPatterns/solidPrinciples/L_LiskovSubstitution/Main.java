package solidPrinciples.L_LiskovSubstitution;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        PaymentClient client=new PaymentClient();

        List<PaymentService> paymentList=List.of(new CreditCard(),new UPI());
        for(PaymentService payment:paymentList){
            client.processTransaction(payment);
        }

        NonRefundablePayments nonRefundablePayments=new Crypto();
        client.processTransaction(nonRefundablePayments);
    }
}
