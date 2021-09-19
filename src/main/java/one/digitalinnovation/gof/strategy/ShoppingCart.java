package one.digitalinnovation.gof.strategy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class ShoppingCart {
    private List<Item> items;
    private int amount;

    public int calculateTotal() {
        return items.stream().mapToInt(i -> i.getPrice()).sum();
    }

    public void pay(PaymentStrategy paymentMethod) {
        amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
