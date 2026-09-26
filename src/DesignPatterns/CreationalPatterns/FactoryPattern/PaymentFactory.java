package DesignPatterns.CreationalPatterns.FactoryPattern;

public class PaymentFactory {
	public static Payment checkPayment(String type) {
		if("credit".equalsIgnoreCase(type))
			return new creditPayment();
		else if("upi".equalsIgnoreCase(type))
			return new UPIPayment();
		else if("paypal".equalsIgnoreCase(type))
			return new PaypalPayment();
		else
			throw new IllegalArgumentException("Invalid Payment Type");
	}
}
