package DesignPatterns.CreationalPatterns.AbstractFactoryPattern;

public class MacFactory implements UIFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}

	@Override
	public Checkbox createCheckbox() {
		// TODO Auto-generated method stub
		return new MacCheckbox();
	}
	

}
