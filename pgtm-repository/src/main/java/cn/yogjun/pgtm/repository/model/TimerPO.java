package cn.yogjun.pgtm.repository.model;

import cn.yogjun.pgtm.api.base.dos.TimeDO;
import cn.yogjun.pgtm.repository.BasePO;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link TimerPO}
 *
 * @author <a href="mailto:280536928@qq.com">yogjun</a>
 * @version ${project.version} - 2023/9/28
 */
@Data
@Document("timer")
public class TimerPO extends BasePO {

  private Long userId;
  private Long bizId;

  private List<TimeDO> timers = new ArrayList<>(0);
}
