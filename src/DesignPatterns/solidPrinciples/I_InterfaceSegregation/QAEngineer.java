package DesignPatterns.solidPrinciples.I_InterfaceSegregation;

public class QAEngineer implements Tester{

//    @Override
//    public void writeCode() {
//        throw new UnsupportedOperationException();
//    }

    @Override
    public void testCode() {
        System.out.println("Testing Application");
    }
//
//    @Override
//    public void deployApplication() {
//        throw new UnsupportedOperationException();
//    }
}
