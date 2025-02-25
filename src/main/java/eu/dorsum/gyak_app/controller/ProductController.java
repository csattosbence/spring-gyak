package eu.dorsum.gyak_app.controller;

import eu.dorsum.gyak_app.model.Product;
import eu.dorsum.gyak_app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/product")
    public void insertProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @GetMapping("/product")
    public ResponseEntity<List<Product>> getProducts(){
        try {
            List<Product> products = productService.getProducts();
            return new ResponseEntity<>(products,HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



    public ProductController() {

    }

}
