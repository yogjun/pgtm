package cn.yogjun.pgtm.api.base.dto;

import cn.yogjun.pgtm.api.base.dos.TimeDO;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link TimerDTO}
 *
 * @author <a href="mailto:280536928@qq.com">yogjun</a>
 * @version ${project.version} - 2023/10/10
 */
@Data
public class TimerDTO {

  private Long userId;
  private Long bizId;

  private List<TimeDO> timers = new ArrayList<>(0);
}
