package cn.yogjun.pgtm.repository;

import lombok.Data;

import java.io.Serializable;

/**
 * {@link BasePO}
 *
 * @author <a href="mailto:280536928@qq.com">yogjun</a>
 * @version ${project.version} - 2023/9/28
 */
@Data
public class BasePO implements Serializable {
  private Long id;
  private Boolean deleted;
}
