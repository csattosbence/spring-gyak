package eu.dorsum.gyak_app.service.impl;

import eu.dorsum.gyak_app.model.Product;
import eu.dorsum.gyak_app.service.ProductService;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("fastProductService")
public class FastProductServiceImpl implements ProductService {

    Logger logger
            = LoggerFactory.getLogger(FastProductServiceImpl.class);

    @Override
    public List<Product> getProducts() {
        logger.info("getProducts called");
        return null;
    }

    @Override
    public void addProduct(Product product) {

    }

    @PostConstruct
    public void init() {
        logger.info("init");
    }



}
