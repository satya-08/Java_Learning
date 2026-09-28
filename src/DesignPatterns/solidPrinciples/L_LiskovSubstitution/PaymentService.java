package DesignPatterns.solidPrinciples.L_LiskovSubstitution;

public interface PaymentService extends NonRefundablePayments{
//    void pay();
    void refund();
}
