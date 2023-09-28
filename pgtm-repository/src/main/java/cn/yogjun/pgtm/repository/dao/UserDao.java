package cn.yogjun.pgtm.repository.dao;

import cn.yogjun.pgtm.repository.model.UserPO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * {@link UserDao}
 *
 * @author <a href="mailto:280536928@qq.com">yogjun</a>
 * @version ${project.version} - 2023/9/26
 */
@Repository
public interface UserDao extends MongoRepository<UserPO, Long> {}
