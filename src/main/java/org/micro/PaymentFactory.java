package org.micro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PaymentFactory {

    private final ApplicationContext context;

    @Autowired
    public PaymentFactory(ApplicationContext context) {
        this.context = context;
    }

    public Payment getPaymentMethod(String paymentType) {
        return Optional.ofNullable(context.getBean(paymentType, Payment.class))
                .orElseThrow(() -> new IllegalArgumentException("نوع پرداخت نامعتبر است: " + paymentType));
    }
}
