package cn.yogjun.pgtm.user.service;

import cn.yogjun.pgtm.api.dto.UserInfoDTO;
import cn.yogjun.pgtm.api.user.UserInfoVO;

/**
 * {@link UserService}
 *
 * @author <a href="mailto:matthew.miao@yunlsp.com">matthew.miao</a>
 * @version ${project.version} - 2023/9/28
 */
public interface UserService {
  UserInfoDTO getUserInfoByPhone(String phone);
}
