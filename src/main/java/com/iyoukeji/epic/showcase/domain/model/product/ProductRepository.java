package com.iyoukeji.epic.showcase.domain.model.product;

import java.math.BigDecimal;
import java.util.Collection;

public interface ProductRepository {

    Product findById(ProductId productId);

    Collection<Product> findByIds(ProductId[] productIds);

    Collection<Product> findByIds(Collection<ProductId> productIds);

    Product lockStock(ProductId productId, BigDecimal amount);

    Product releaseStock(ProductId productId, BigDecimal amount);
}
