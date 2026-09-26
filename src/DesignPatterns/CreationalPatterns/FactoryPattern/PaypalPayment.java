package DesignPatterns.CreationalPatterns.FactoryPattern;

public class PaypalPayment implements Payment{
	@Override
	public void payment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid: "+amount+" via Paypal Payment");
	}
}
