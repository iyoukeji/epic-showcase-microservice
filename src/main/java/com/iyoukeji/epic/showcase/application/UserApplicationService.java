package com.iyoukeji.epic.showcase.application;

import com.iyoukeji.epic.showcase.application.command.UserRegisterCommand;
import com.iyoukeji.epic.showcase.domain.model.user.User;
import com.iyoukeji.epic.showcase.domain.model.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户应用服务类
 */
@Service
public class UserApplicationService {
    private UserService userService;

    @Autowired
    public UserApplicationService(UserService userService) {
        this.userService = userService;
    }

    /**
     * 用户注册
     *
     * @param command 用户注册命令
     *
     * @return 注册的用户对象
     */
    public User register(UserRegisterCommand command) {
        return this.userService.register(command.getAccount(),
                                         command.getEmail(),
                                         command.getPhone(),
                                         command.getPassword());
    }
}
