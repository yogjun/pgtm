package cn.yogjun.pgtm.repository.model;

import cn.yogjun.pgtm.repository.BasePO;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/**
 * {@link ActivityPO}
 *
 * @author <a href="mailto:280536928@qq.com">yogjun</a>
 * @version ${project.version} - 2023/9/28
 */
@Data
@Document("activity")
public class ActivityPO extends BasePO {
  private String name;
  private String bizType;
  /** 插图 */
  private String image;
  /** 最大参与人数 */
  private Integer maxUserNum;
  /** 活动开始时间 */
  private LocalDateTime fromDateTime;

  /** 活动结束时间 */
  private LocalDateTime toDateTime;
}
