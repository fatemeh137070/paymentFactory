package org.micro;

import org.springframework.stereotype.Component;

@Component("online_payment")
public class OnlinePayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("پرداخت آنلاین: " + amount);
    }
}
