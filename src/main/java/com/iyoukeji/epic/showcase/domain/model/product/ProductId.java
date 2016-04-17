package com.iyoukeji.epic.showcase.domain.model.product;

import com.google.common.base.Objects;
import com.iyoukeji.epic.common.domain.model.AssertionConcern;
import com.iyoukeji.epic.common.domain.model.Identity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ProductId extends AssertionConcern implements Identity, Serializable {

    @Column(name = "product_id", length = 48)
    private String id;

    public ProductId() {
        super();
    }

    public ProductId(String id) {
        this.setId(id);
    }

    @Override
    public String id() {
        return id;
    }

    public void setId(String id) {
        this.assertArgumentNotEmpty(id, "商品ID不能为空.");
        this.assertArgumentLength(id, 48, "商品ID长度必须在48个字符以内.");

        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductId productId = (ProductId) o;
        return Objects.equal(id, productId.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ProductId{" +
            "id='" + id + '\'' +
            '}';
    }
}
