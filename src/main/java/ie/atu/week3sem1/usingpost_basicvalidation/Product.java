package ie.atu.week3sem1.usingpost_basicvalidation;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    @NotBlank
    private String productName;
    @Positive
    private double price;
}
