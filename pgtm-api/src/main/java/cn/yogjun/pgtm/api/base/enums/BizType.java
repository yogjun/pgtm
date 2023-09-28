package cn.yogjun.pgtm.api.base.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * {@link BizType}
 *
 * @author <a href="mailto:280536928@qq.com">yogjun</a>
 * @version ${project.version} - 2023/9/28
 */
@Getter
@AllArgsConstructor
public enum BizType {
  APPOINTMENT("APPOINTMENT", "预约时间"),
  ;

  private String type;
  private String desc;
}
