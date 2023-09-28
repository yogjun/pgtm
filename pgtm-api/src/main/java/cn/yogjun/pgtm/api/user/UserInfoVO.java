package cn.yogjun.pgtm.api.user;

import lombok.Data;

/**
 * {@link UserInfoVO}
 *
 * @author <a href="mailto:280536928@qq.com">yogjun</a>
 * @version ${project.version} - 2023/9/28
 */
@Data
public class UserInfoVO {
  private String username;
  private String nickname;
  private String phone;
}
