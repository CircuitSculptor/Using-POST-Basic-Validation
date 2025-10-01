package ie.atu.week3sem1.usingpost_basicvalidation;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/product")
@RestController
public class ProductController {
    List<Product> myList = new ArrayList<>();

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/getproduct")
    public List<Product> getProduct() {
        Product myProduct = new Product("TV", 499);
        return myList;
    }

    @GetMapping("/getCount")
    public String getCount() {
        return "Amount of products added = " + myList.size();
    }

    @PostMapping("/addProduct")
    public Product addProduct(@Valid @RequestBody Product myProduct) {
        myList.add(myProduct);
        return myProduct;
    }
}