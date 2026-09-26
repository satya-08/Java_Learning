package DesignPatterns.CreationalPatterns.FactoryPattern;

public class UPIPayment implements Payment{

	@Override
	public void payment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid: "+amount+" via UPI ");
	}

}
