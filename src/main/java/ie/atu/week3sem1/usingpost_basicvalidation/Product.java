package ie.atu.week3sem1.usingpost_basicvalidation;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    // Placeholder for productName and price
    // I have Validation in case the user leaves the name blank and types a name bigger than 20 characters
    @NotBlank
    @Size(min = 1, max = 20)
    private String productName;
    // Validation in case the user enters a negative price
    @Positive
    private double price;
    // If any of the Validation cases become true, the name or price will not be set
}
