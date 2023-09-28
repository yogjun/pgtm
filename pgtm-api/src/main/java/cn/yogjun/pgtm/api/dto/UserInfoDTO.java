package cn.yogjun.pgtm.api.dto;

import lombok.Data;

/**
 * {@link UserInfoDTO}
 *
 * @author <a href="mailto:matthew.miao@yunlsp.com">matthew.miao</a>
 * @version ${project.version} - 2023/9/28
 */
@Data
public class UserInfoDTO {
  private String username;
  private String nickname;
  private String phone;
}
