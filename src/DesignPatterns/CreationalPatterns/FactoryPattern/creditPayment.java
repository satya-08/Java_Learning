package DesignPatterns.CreationalPatterns.FactoryPattern;

public class creditPayment implements Payment{

	@Override
	public void payment(double amount) {
		System.out.println("Paid: "+amount+" via Credit Card");
	}

}
