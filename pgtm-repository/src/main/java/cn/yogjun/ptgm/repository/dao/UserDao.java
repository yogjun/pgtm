package cn.yogjun.ptgm.repository.dao;

import cn.yogjun.ptgm.repository.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * {@link UserDao}
 *
 * @author <a href="mailto:matthew.miao@yunlsp.com">matthew.miao</a>
 * @version ${project.version} - 2023/9/26
 */
@Repository
public interface UserDao extends MongoRepository<User, Long> {}
