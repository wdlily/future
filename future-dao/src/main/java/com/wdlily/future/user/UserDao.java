package com.wdlily.future.user;

import com.wdlily.future.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author: WangDi
 * @Date: 2018/2/24 17:42
 */
@Repository
public interface UserDao extends MongoRepository<User, String> {


}
