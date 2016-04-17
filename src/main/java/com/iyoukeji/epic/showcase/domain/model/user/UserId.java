package com.iyoukeji.epic.showcase.domain.model.user;

import com.google.common.base.Objects;
import com.iyoukeji.epic.common.domain.model.AssertionConcern;
import com.iyoukeji.epic.common.domain.model.Identity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * UserId
 */
@Embeddable
public class UserId extends AssertionConcern implements Identity, Serializable {
    @Column(name = "user_id", length = 48)
    private String id;

    public UserId() {
        super();
    }

    public UserId(String id) {
        this.setId(id);
    }

    @Override
    public String id() {
        return id;
    }

    public void setId(String id) {
        this.assertArgumentNotEmpty(id, "用户ID不能为空.");
        this.assertArgumentLength(id, 48, "用户ID长度必须在48个字符以内.");

        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserId userId = (UserId) o;
        return Objects.equal(id, userId.id);
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
