package one.digitalinnovation.gof.strategy;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Item {
    private String upcCode;
    private int price;
}
