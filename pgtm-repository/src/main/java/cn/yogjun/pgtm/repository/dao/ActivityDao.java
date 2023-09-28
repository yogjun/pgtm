package cn.yogjun.pgtm.repository.dao;

import cn.yogjun.pgtm.repository.model.ActivityPO;
import cn.yogjun.pgtm.repository.model.TimerPO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * {@link ActivityDao}
 *
 * @author <a href="mailto:280536928@qq.com">yogjun</a>
 * @version ${project.version} - 2023/9/28
 */
@Repository
public interface ActivityDao extends MongoRepository<ActivityPO, Long> {}
