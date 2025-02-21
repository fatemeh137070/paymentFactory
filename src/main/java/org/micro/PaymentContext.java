package org.micro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentContext {

    private final PaymentFactory paymentFactory;

    @Autowired
    public PaymentContext(PaymentFactory paymentFactory) {
        this.paymentFactory = paymentFactory;
    }

    public void executePayment(String paymentType, double amount) {
        Payment payment = paymentFactory.getPaymentMethod(paymentType);
        payment.pay(amount);
    }
}
