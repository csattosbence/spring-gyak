package eu.dorsum.gyak_app.service;

import eu.dorsum.gyak_app.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public interface ProductService {

    public List<Product> getProducts();

    public void addProduct(Product product);

}
