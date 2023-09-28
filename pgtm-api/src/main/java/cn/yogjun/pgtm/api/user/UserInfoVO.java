package cn.yogjun.pgtm.api.user;

import lombok.Data;

/**
 * {@link UserInfoVO}
 *
 * @author <a href="mailto:matthew.miao@yunlsp.com">matthew.miao</a>
 * @version ${project.version} - 2023/9/28
 */
@Data
public class UserInfoVO {
  private String username;
  private String nickname;
  private String phone;
}
