package cn.yogjun.pgtm.repository.model;

import cn.yogjun.pgtm.api.base.dos.TimeDO;
import lombok.Data;

import java.util.List;

/**
 * {@link TimerPO}
 *
 * @author <a href="mailto:280536928@qq.com">yogjun</a>
 * @version ${project.version} - 2023/9/28
 */
@Data
public class TimerPO {
  private Long id;
  private Long userId;
  private Long bizId;
  private String bizType;

  private List<TimeDO> timers;
}
