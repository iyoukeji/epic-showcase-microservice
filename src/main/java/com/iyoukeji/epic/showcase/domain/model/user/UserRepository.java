package com.iyoukeji.epic.showcase.domain.model.user;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

/**
 * 用户对象仓库
 */
public interface UserRepository {

    /**
     * 分页查找用户
     *
     * @param specification 查询
     * @param pageable      分页
     *
     * @return 用户
     */
    Page<User> findAll(Specification<User> specification, Pageable pageable);

    /**
     * 按账号查找用户
     *
     * @param account 账号
     *
     * @return 用户对象
     */
    User findByAccount(String account);

    /**
     * 保存用户对象
     *
     * @param user 用户对象
     */
    void save(User user);
}
