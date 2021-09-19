package one.digitalinnovation.gof.strategy;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CreditCardStrategy implements PaymentStrategy{

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    @Override
    public void pay(int amount) {
        System.out.println(amount +" paid with credit/debit card");
    }
}
