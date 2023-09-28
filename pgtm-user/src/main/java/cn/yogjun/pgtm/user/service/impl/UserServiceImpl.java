package cn.yogjun.pgtm.user.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.yogjun.pgtm.api.base.dto.UserInfoDTO;
import cn.yogjun.pgtm.repository.dao.UserDao;
import cn.yogjun.pgtm.repository.model.UserPO;
import cn.yogjun.pgtm.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * {@link UserServiceImpl}
 *
 * @author <a href="mailto:280536928@qq.com">yogjun</a>
 * @version ${project.version} - 2023/9/28
 */
@Service
public class UserServiceImpl implements UserService {

  @Autowired private UserDao userDao;

  @Override
  public UserInfoDTO getUserInfoByPhone(String phone) {
    UserPO userPO = new UserPO();
    userPO.setPhone(phone);
    Optional<UserPO> po = userDao.findOne(Example.of(userPO));
    if (po.isPresent()) {
      return BeanUtil.copyProperties(po.get(), UserInfoDTO.class);
    }
    return null;
  }
}
