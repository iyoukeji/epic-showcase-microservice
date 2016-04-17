package com.iyoukeji.epic.showcase.domain.model.user;

import com.iyoukeji.epic.common.domain.model.DomainEntity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 用户实体类
 */
@Entity
@Table(name = "t_user")
public class User extends DomainEntity {

    @EmbeddedId
    private UserId userId;

    private String account;
    private String email;
    private String phone;
    private String password;
    private String salt;
    private String displayName;
    private String avatar;
    private Date created;

    public UserId getUserId() {
        return userId;
    }

    public User setUserId(UserId userId) {
        this.assertArgumentNotNull(userId, "UserId can not be null.");
        this.userId = userId;
        return this;
    }

    public String getAccount() {
        return account;
    }

    public User setAccount(String account) {
        this.assertArgumentNotEmpty(account, "Account can not be empty.");
        this.assertArgumentLength(account, 3, 50, "Account length mush between 3 and 50 chars.");
        this.account = account;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.assertArgumentNotEmpty(email, "Email can not be empty.");
        this.assertArgumentLength(email, 3, 50, "Email length mush between 3 and 50 chars.");
        this.assertArgumentTrue(email.matches("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*"),
                                "Invalid email address.");
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public User setPhone(String phone) {
        this.assertArgumentNotEmpty(phone, "Phone number can not be empty.");
        this.assertArgumentLength(phone, 3, 50, "Phone number length mush between 3 and 50 chars.");
        this.phone = phone;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getSalt() {
        return salt;
    }

    public User setSalt(String salt) {
        this.salt = salt;
        return this;
    }

    public String getDisplayName() {
        return displayName;
    }

    public User setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public String getAvatar() {
        return avatar;
    }

    public User setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    public Date getCreated() {
        return created;
    }

    public User setCreated(Date created) {
        this.created = created;
        return this;
    }
}
