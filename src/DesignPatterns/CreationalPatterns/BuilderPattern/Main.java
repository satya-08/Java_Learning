package DesignPatterns.CreationalPatterns.BuilderPattern;

public class Main {
	public static void main(String[] args) {
		Laptop lap=new Laptop.Builder("Lenovo", "i5")
				.ram(16)
				.ssd(512)
				.touchScreen(false)
				.build();
		System.out.println(lap.toString());
	}

}
