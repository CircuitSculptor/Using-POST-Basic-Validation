package ie.atu.week3sem1.usingpost_basicvalidation;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String productName;
    private double price;
}
