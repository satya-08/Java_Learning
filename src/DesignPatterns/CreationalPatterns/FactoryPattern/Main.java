package DesignPatterns.CreationalPatterns.FactoryPattern;

public class Main {
	public static void main(String[] args) {
		Payment p1=PaymentFactory.checkPayment("credit");
		p1.payment(1000);
		Payment p2=PaymentFactory.checkPayment("upi");
		p2.payment(20000);
	}

}
