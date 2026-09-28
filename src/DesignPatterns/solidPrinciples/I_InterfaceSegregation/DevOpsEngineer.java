package DesignPatterns.solidPrinciples.I_InterfaceSegregation;

public class DevOpsEngineer implements Deployer{

//    @Override
//    public void writeCode() {
//        throw new UnsupportedOperationException();
//    }
//
//    @Override
//    public void testCode() {
//        throw new UnsupportedOperationException();
//    }

    @Override
    public void deployApplication() {
        System.out.println("Deploying Application");
    }
}
