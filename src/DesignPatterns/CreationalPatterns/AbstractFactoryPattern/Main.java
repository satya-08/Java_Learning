package DesignPatterns.CreationalPatterns.AbstractFactoryPattern;

public class Main {
	public static void main(String[] args) {
		UIFactory factory=new WindowFactory();
		Button button=factory.createButton();
		Checkbox checkbox=factory.createCheckbox();
		
		button.paint();
		checkbox.paint();
	}

}
