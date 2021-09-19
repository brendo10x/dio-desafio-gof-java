package one.digitalinnovation.gof.strategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ShoppingCartTest {

    @Test
    public void verifyTotalPaymentByPaypal() {

        // create items
        Item item1 = Item.builder().upcCode("1").price(10).build();
        Item item2 = Item.builder().upcCode("5").price(600).build();

        // add items in Shopping card
        ShoppingCart shoppingCart = ShoppingCart.builder().items(Arrays.asList(item1, item2)).build();

        // choosing PayPal payment method
        PaypalStrategy paypalStrategy = PaypalStrategy.builder().emailId("brendo10x@gmail.com").password("1234").build();

        // making payment
        shoppingCart.pay(paypalStrategy);

        // verify total
        assertEquals(610, shoppingCart.getAmount());
    }

    @Test
    public void verifyTotalPaymentByCreditCard() {

        // create items
        Item item1 = Item.builder().upcCode("1").price(10).build();
        Item item2 = Item.builder().upcCode("3").price(600).build();
        Item item3 = Item.builder().upcCode("6").price(75).build();

        // add items in Shopping card
        ShoppingCart shoppingCart = ShoppingCart.builder().items(Arrays.asList(item1, item2, item3)).build();

        // choosing PayPal payment method
        CreditCardStrategy creditCardStrategy = CreditCardStrategy.builder().name("NuBank").cardNumber("00000-13").cvv("999").build();

        // making payment
        shoppingCart.pay(creditCardStrategy);

        // verify total
        assertEquals(685, shoppingCart.getAmount());

    }
}
