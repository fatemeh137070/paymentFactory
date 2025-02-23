package org.micro;

import org.springframework.stereotype.Component;

@Component("cash_payment")
public class CashPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("پرداخت نقدی: " + amount);
    }
}
