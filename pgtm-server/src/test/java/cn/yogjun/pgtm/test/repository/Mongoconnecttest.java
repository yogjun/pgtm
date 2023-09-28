package cn.yogjun.pgtm.test.repository;

import cn.hutool.core.util.IdUtil;
import cn.yogjun.pgtm.PgtmApplication;
import cn.yogjun.pgtm.repository.dao.UserDao;
import cn.yogjun.pgtm.repository.model.UserPO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * {@link Mongoconnecttest}
 *
 * @author <a href="mailto:280536928@qq.com">yogjun</a>
 * @version ${project.version} - 2023/9/27
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = PgtmApplication.class)
public class Mongoconnecttest {

  @Autowired private UserDao userDao;
  @Autowired private MongoTemplate mongoTemplate;

  @Test
  public void contextLoads1() {
    UserPO userPO = new UserPO();
    userPO.setId(IdUtil.getSnowflakeNextId());
    userDao.insert(userPO);
    userDao.findAll().forEach(x -> System.out.println(x));
  }

  @Test
  public void contextLoads() {
    mongoTemplate.findAll(UserPO.class).forEach(x -> System.out.println(x));
  }
}
