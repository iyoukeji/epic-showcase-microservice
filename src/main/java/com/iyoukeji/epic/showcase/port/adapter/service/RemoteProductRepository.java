package com.iyoukeji.epic.showcase.port.adapter.service;

import com.iyoukeji.epic.showcase.domain.model.product.Product;
import com.iyoukeji.epic.showcase.domain.model.product.ProductId;
import com.iyoukeji.epic.showcase.domain.model.product.ProductRepository;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Collection;

@Component
@FeignClient()
public class RemoteProductRepository implements ProductRepository {

    @Override
    public Product findById(ProductId productId) {
        return null;
    }

    @Override
    public Collection<Product> findByIds(ProductId[] productIds) {
        return null;
    }

    @Override
    public Collection<Product> findByIds(Collection<ProductId> productIds) {
        return null;
    }

    @Override
    public Product lockStock(ProductId productId, BigDecimal amount) {
        return null;
    }

    @Override
    public Product releaseStock(ProductId productId, BigDecimal amount) {
        return null;
    }
}
