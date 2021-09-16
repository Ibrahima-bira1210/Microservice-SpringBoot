package com.microservice.produitservice.web;

import com.microservice.produitservice.entities.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductServiceImpl implements ProductService {

    private static final Logger LOG = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Override
    public Product getProduct(Long productId) {
        LOG.debug("/product return the found product for productId={}",productId);
        return new Product(productId,"WashMachine",234);
    }
}
