package org.micro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "org.micro")
public class MainApplication {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MainApplication.class);

        PaymentContext paymentContext = context.getBean(PaymentContext.class);

        paymentContext.executePayment(PaymentType.CARD_PAYMENT, 100000);
        paymentContext.executePayment(PaymentType.CASH_PAYMENT, 50000);
        paymentContext.executePayment(PaymentType.ONLINE_PAYMENT, 200000);
    }
}
