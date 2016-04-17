package com.iyoukeji.epic.showcase.domain.model.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户服务
 */
@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * 注册用户
     *
     * @param account  用户名
     * @param email    邮箱
     * @param phone    电话
     * @param password 密码
     *
     * @return 注册的用户对象
     */
    public User register(String account, String email, String phone, String password) {
        User user = new User().setAccount(account)
            .setEmail(email)
            .setPhone(phone)
            .setPassword(password);
        userRepository.save(user);

        return user;
    }
}
