package cn.yogjun.test.time;

import cn.hutool.core.util.IdUtil;
import cn.yogjun.pgtm.PgtmApplication;
import cn.yogjun.pgtm.api.base.enums.BizType;
import cn.yogjun.pgtm.repository.dao.ActivityDao;
import cn.yogjun.pgtm.repository.dao.UserDao;
import cn.yogjun.pgtm.repository.model.ActivityPO;
import cn.yogjun.pgtm.repository.model.UserPO;
import cn.yogjun.pgtm.time.service.ActivityService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * {@link TimeTest}
 *
 * @author <a href="mailto:280536928@qq.com">yogjun</a>
 * @version ${project.version} - 2023/9/27
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = PgtmApplication.class)
public class TimeTest {

  @Autowired private ActivityDao activityDao;
  @Autowired private ActivityService activityService;

  @Test
  public void testAddActivity() {
    ActivityPO activityPO = new ActivityPO();
    activityPO.setId(IdUtil.getSnowflakeNextId());
    activityPO.setName("博得之门3");
    activityPO.setBizType(BizType.APPOINTMENT.getType());
    activityPO.setMaxUserNum(8);
    activityDao.save(activityPO);
  }
}
