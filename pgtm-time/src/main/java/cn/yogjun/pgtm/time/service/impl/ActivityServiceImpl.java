package cn.yogjun.pgtm.time.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.stream.StreamUtil;
import cn.yogjun.pgtm.api.base.dto.ActivityDTO;
import cn.yogjun.pgtm.repository.dao.ActivityDao;
import cn.yogjun.pgtm.time.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * {@link ActivityServiceImpl}
 *
 * @author <a href="mailto:280536928@qq.com">yogjun</a>
 * @version ${project.version} - 2023/9/28
 */
@Service
public class ActivityServiceImpl implements ActivityService {

  @Autowired private ActivityDao activityDao;

  @Override
  public List<ActivityDTO> list() {
    return activityDao.findAll().stream()
        .map(x -> BeanUtil.copyProperties(x, ActivityDTO.class))
        .collect(Collectors.toList());
  }
}
