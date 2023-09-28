package cn.yogjun.pgtm.time.endpoint;

import cn.hutool.core.bean.BeanUtil;
import cn.yogjun.pgtm.api.user.ActivityVO;
import cn.yogjun.pgtm.time.service.ActivityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * {@link ActivityEndpoint}
 *
 * @author <a href="mailto:280536928@qq.com">yogjun</a>
 * @version ${project.version} - 2023/9/28
 */
@Slf4j
@RestController
@RequestMapping("/time/activity")
public class ActivityEndpoint {

  @Autowired private ActivityService activityService;

  @PostMapping("/list")
  public List<ActivityVO> list() {
    return activityService.list().stream()
        .map(x -> BeanUtil.copyProperties(x, ActivityVO.class))
        .collect(Collectors.toList());
  }
}
