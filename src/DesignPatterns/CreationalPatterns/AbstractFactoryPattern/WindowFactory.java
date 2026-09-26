package DesignPatterns.CreationalPatterns.AbstractFactoryPattern;

public class WindowFactory implements UIFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WidowButton();
	}

	@Override
	public Checkbox createCheckbox() {
		// TODO Auto-generated method stub
		return new WindowChekbox();
	}
	

}
