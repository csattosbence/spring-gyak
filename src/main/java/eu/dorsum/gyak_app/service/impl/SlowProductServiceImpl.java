package eu.dorsum.gyak_app.service.impl;

import eu.dorsum.gyak_app.model.Product;
import eu.dorsum.gyak_app.repository.ProductRepository;
import eu.dorsum.gyak_app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service("slowProductService")
public class SlowProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts() {
        List<Product> filteredProducts = new ArrayList<>();
        List<Product> result;
        result = productRepository.findAll();

        //filteredProducts = result.stream().filter(product -> product.getPrice() > 200).collect(Collectors.toList());

        return result;
    }

    @Override
    public Product getProdcutByName(String name) {
        Product product = productRepository.findByName(name);
        return product;
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }
}
