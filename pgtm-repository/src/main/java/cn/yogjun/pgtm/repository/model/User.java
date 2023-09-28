package cn.yogjun.pgtm.repository.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * {@link User}
 *
 * @author <a href="mailto:280536928@qq.com">yogjun</a>
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
