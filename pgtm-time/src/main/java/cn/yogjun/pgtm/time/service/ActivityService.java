package cn.yogjun.pgtm.time.service;

import cn.yogjun.pgtm.api.base.dto.ActivityDTO;

import java.util.List;

/**
 * {@link ActivityService}
 *
 * @author <a href="mailto:280536928@qq.com">yogjun</a>
 * @version ${project.version} - 2023/9/28
 */
public interface ActivityService {
  List<ActivityDTO> list();
}
