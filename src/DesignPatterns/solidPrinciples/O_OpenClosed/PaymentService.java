package DesignPatterns.solidPrinciples.O_OpenClosed;
//
//public class PaymentService {
//    public void processPayment(String type){
//        if(type=="UPI"){
//            System.out.println("UPI Payment process");
//        }else if(type=="Credit Card"){
//            System.out.println("Credit Card Payment process");
//        }else if(type=="Net Banking"){
//            System.out.println("Net Banking Payment process");
//        }
//
//        /* "Software entities should be open for extension but closed for modification."
//
//        We should add new functionality without changing existing code.*/
//
//
//
//    }
//}


public interface PaymentService{
    void processPayment();
}