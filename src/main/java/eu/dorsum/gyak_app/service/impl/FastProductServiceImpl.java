package eu.dorsum.gyak_app.service.impl;

import eu.dorsum.gyak_app.model.Product;
import eu.dorsum.gyak_app.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("fastProductService")
public class FastProductServiceImpl implements ProductService {

    @Override
    public List<Product> getProducts() {
        return null;
    }

    @Override
    public void addProduct(Product product) {

    }

}
