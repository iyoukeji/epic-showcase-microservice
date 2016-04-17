package com.iyoukeji.epic.showcase.resource;

import com.iyoukeji.epic.common.exception.NotFoundException;
import com.iyoukeji.epic.showcase.application.UserApplicationService;
import com.iyoukeji.epic.showcase.application.command.UserRegisterCommand;
import com.iyoukeji.epic.showcase.application.representation.UserRepresentation;
import com.iyoukeji.epic.showcase.domain.model.user.User;
import com.iyoukeji.epic.showcase.domain.model.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    private UserRepository userRepository;
    private UserApplicationService userApplicationService;

    @Autowired
    public UserResource(UserRepository userRepository,
                        UserApplicationService userApplicationService) {
        this.userRepository = userRepository;
        this.userApplicationService = userApplicationService;
    }

    /**
     * 按账户名称获取用户对象
     *
     * @param account 账户名称
     *
     * @return 用户对象
     */
    @RequestMapping(value = "account/{account}", method = RequestMethod.GET, produces = "application/json")
    public UserRepresentation findUserByAccount(String account) {
        User user = this.userRepository.findByAccount(account);
        if (user == null) {
            throw new NotFoundException();
        }

        return new UserRepresentation(user);
    }

    /**
     * 注册新用户
     *
     * @param command 用户注册命令
     *
     * @return 用户对象
     */
    @RequestMapping(value = "register", method = RequestMethod.PUT,
        consumes = "application/json",
        produces = "application/json")
    public UserRepresentation register(@RequestBody UserRegisterCommand command) {
        return new UserRepresentation(this.userApplicationService.register(command));
    }
}
