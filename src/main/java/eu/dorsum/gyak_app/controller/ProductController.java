package eu.dorsum.gyak_app.controller;

import eu.dorsum.gyak_app.model.Product;
import eu.dorsum.gyak_app.service.ProductService;
import eu.dorsum.gyak_app.service.impl.FastProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Qualifier("slowProductService")
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

    @GetMapping("/getProductByName")
    public ResponseEntity<Product> getProdcutByName(@RequestParam String name) {
        Product product = productService.getProdcutByName(name);

        return new ResponseEntity<>(product,HttpStatus.OK);

    }



    public ProductController() {

    }

}
