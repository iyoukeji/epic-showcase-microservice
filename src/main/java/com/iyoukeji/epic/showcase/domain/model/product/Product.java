package com.iyoukeji.epic.showcase.domain.model.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Objects;
import com.iyoukeji.epic.common.domain.model.ValueObject;

import java.math.BigDecimal;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Product extends ValueObject {

    private ProductId productId;
    private String name;
    private BigDecimal currentPrice;
    private Date currentPriceTime;
    private BigDecimal currentStock;

    public Product() {
        super();
    }

    public ProductId getProductId() {
        return productId;
    }

    public void setProductId(ProductId productId) {
        this.productId = productId;
    }

    @JsonProperty("id")
    public void setProductId(String productId) {
        this.productId = new ProductId(productId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Date getCurrentPriceTime() {
        return currentPriceTime;
    }

    public void setCurrentPriceTime(Date currentPriceTime) {
        this.currentPriceTime = currentPriceTime;
    }

    public BigDecimal getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(BigDecimal currentStock) {
        this.currentStock = currentStock;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equal(productId, product.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(productId);
    }

    @Override
    public String toString() {
        return "Product{" +
            "productId=" + productId +
            ", name='" + name + '\'' +
            ", currentPrice=" + currentPrice +
            ", currentPriceTime=" + currentPriceTime +
            ", currentStock=" + currentStock +
            '}';
    }
}
