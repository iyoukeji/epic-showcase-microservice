package com.iyoukeji.epic.showcase.application.command;

import java.io.Serializable;

/**
 * 用户注册命令类
 */
public class UserRegisterCommand implements Serializable {

    private String account;
    private String email;
    private String phone;
    private String password;

    public String getAccount() {
        return account;
    }

    public UserRegisterCommand setAccount(String account) {
        this.account = account;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserRegisterCommand setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public UserRegisterCommand setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserRegisterCommand setPassword(String password) {
        this.password = password;
        return this;
    }
}
