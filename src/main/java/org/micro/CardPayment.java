package org.micro;

import org.springframework.stereotype.Component;

@Component("cardPayment")
public class CardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("پرداخت از طریق کارت: " + amount);
    }
}
