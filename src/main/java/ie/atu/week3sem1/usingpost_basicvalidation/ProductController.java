package ie.atu.week3sem1.usingpost_basicvalidation;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/product")
@RestController
public class ProductController {
    // Array to store products
    List<Product> myList = new ArrayList<>();

    // Test Swagger UI
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    // Prints all products in the product list
    @GetMapping("/getproduct")
    public List<Product> getProduct() {
        Product myProduct = new Product("TV", 499);
        return myList;
    }

    @GetMapping("/getCount")
    public String getCount() {
        // Prints the amount of added products to the user
        return "Amount of products added = " + myList.size();
    }

    // Allows the user to add as many products as they want
    @PostMapping("/addProduct")
    public Product addProduct(@Valid @RequestBody Product myProduct) {
        myList.add(myProduct);
        return myProduct;
    }
}