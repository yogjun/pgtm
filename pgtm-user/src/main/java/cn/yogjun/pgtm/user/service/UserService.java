package cn.yogjun.pgtm.user.service;

import cn.yogjun.pgtm.api.base.dto.UserInfoDTO;

/**
 * {@link UserService}
 *
 * @author <a href="mailto:280536928@qq.com">yogjun</a>
 * @version ${project.version} - 2023/9/28
 */
public interface UserService {
  UserInfoDTO getUserInfoByPhone(String phone);
}
