package one.digitalinnovation.gof.strategy;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaypalStrategy implements PaymentStrategy{

    private String emailId;
    private String password;

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal.");
    }
}
