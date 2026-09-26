package solidPrinciples.I_InterfaceSegregation;

public class BackendDeveloper implements Coder,Tester{
    @Override
    public void writeCode() {
        System.out.println("Writing Backend Code");
    }

    @Override
    public void testCode() {
        System.out.println("Dev Testing");
    }

//    @Override
//    public void deployApplication() {
//        throw new UnsupportedOperationException();
//    }
}
