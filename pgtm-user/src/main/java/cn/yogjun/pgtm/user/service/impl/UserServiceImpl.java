package cn.yogjun.pgtm.user.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.yogjun.pgtm.api.dto.UserInfoDTO;
import cn.yogjun.pgtm.api.user.UserInfoVO;
import cn.yogjun.pgtm.repository.dao.UserDao;
import cn.yogjun.pgtm.repository.model.User;
import cn.yogjun.pgtm.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * {@link UserServiceImpl}
 *
 * @author <a href="mailto:matthew.miao@yunlsp.com">matthew.miao</a>
 * @version ${project.version} - 2023/9/28
 */
@Service
public class UserServiceImpl implements UserService {

  @Autowired private UserDao userDao;

  @Override
  public UserInfoDTO getUserInfoByPhone(String phone) {
    User user = new User();
    user.setPhone(phone);
    Optional<User> po = userDao.findOne(Example.of(user));
    if (po.isPresent()) {
      return BeanUtil.copyProperties(po.get(), UserInfoDTO.class);
    }
    return null;
  }
}
