package cn.yogjun.pgtm.api.base.dos;

import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * {@link TimeDO}
 *
 * @author <a href="mailto:280536928@qq.com">yogjun</a>
 * @version ${project.version} - 2023/9/28
 */
@Data
public class TimeDO {
  /** 约的日期 */
  private LocalDate localDate;

  /**
   * 时间表示类型(暂时只支持split方式)
   *
   * <p>split:分割时间 0表示00:00-00:15,1表示00:15-00:30,以此类推 一共4*24=96个
   *
   * <p>range:时间区间 维护数组，直接维护时间区间 比如00:12-00:17, 12:34-13:45
   */
  private String timeType = "split";

  private List<Integer> split = new ArrayList<>(0);
  //  private List<String> range;
}
