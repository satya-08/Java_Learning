package DesignPatterns.solidPrinciples.L_LiskovSubstitution;

public class PaymentClient {
    public void processTransaction(PaymentService payment){
        payment.pay();
        payment.refund();
    }

    public void processTransaction(NonRefundablePayments payment){
        payment.pay();
    }
}
