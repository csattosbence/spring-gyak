package eu.dorsum.gyak_app.service;

import eu.dorsum.gyak_app.model.Product;
import eu.dorsum.gyak_app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts() {
        List<Product> filteredProducts = new ArrayList<>();
        List<Product> result;
        result = productRepository.findAll();
        filteredProducts = result.stream().filter(product -> product.getPrice() > 200).collect(Collectors.toList());

        return filteredProducts;
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }
}
