package com.iyoukeji.epic.showcase.port.adapter.persistence;

/**
 * 用户仓库接口JPA转接
 */

import com.iyoukeji.epic.showcase.domain.model.user.User;
import com.iyoukeji.epic.showcase.domain.model.user.UserId;
import com.iyoukeji.epic.showcase.domain.model.user.UserRepository;
import org.springframework.data.repository.Repository;

interface JpaUserRepository extends UserRepository, Repository<User, UserId> {

}
