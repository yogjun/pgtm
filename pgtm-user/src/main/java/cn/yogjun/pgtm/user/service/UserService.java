package cn.yogjun.pgtm.user.service;

import cn.yogjun.pgtm.api.dto.UserInfoDTO;
import cn.yogjun.pgtm.api.user.UserInfoVO;

/**
 * {@link UserService}
 *
 * @author <a href="mailto:280536928@qq.com">yogjun</a>
 * @version ${project.version} - 2023/9/28
 */
public interface UserService {
  UserInfoDTO getUserInfoByPhone(String phone);
}
