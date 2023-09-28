package cn.yogjun.ptgm.repository.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * {@link User}
 *
 * @author <a href="mailto:matthew.miao@yunlsp.com">matthew.miao</a>
 * @version ${project.version} - 2023/9/26
 */
@Data
@Document("user")
public class User {
  private Long id;
  private String username;
  private String password;
  private String nickname;
  private String phone;
}
