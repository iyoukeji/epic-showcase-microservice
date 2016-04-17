package com.iyoukeji.epic.showcase.application.representation;

import com.iyoukeji.epic.showcase.domain.model.user.User;

/**
 * 用户展现类
 */
public class UserRepresentation {

    private String id;
    private String account;
    private String email;
    private String phone;
    private String displayName;
    private String avatar;

    public UserRepresentation(User user) {
        this.initializeFrom(user);
    }

    private void initializeFrom(User user) {
        this.id = user.getUserId().id();
        this.account = user.getAccount();
        this.email = user.getEmail();
        this.phone = user.getPhone();
        this.displayName = user.getDisplayName();
        this.avatar = user.getAvatar();
    }

    public String getId() {
        return id;
    }

    public UserRepresentation setId(String id) {
        this.id = id;
        return this;
    }

    public String getAccount() {
        return account;
    }

    public UserRepresentation setAccount(String account) {
        this.account = account;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserRepresentation setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public UserRepresentation setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getDisplayName() {
        return displayName;
    }

    public UserRepresentation setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public String getAvatar() {
        return avatar;
    }

    public UserRepresentation setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
}
