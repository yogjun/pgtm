package cn.yogjun.pgtm.user.endpoint;

import cn.hutool.core.bean.BeanUtil;
import cn.yogjun.pgtm.api.base.dto.UserInfoDTO;
import cn.yogjun.pgtm.api.user.UserInfoVO;
import cn.yogjun.pgtm.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@link WxUserEndpoint}
 *
 * @author <a href="mailto:280536928@qq.com">yogjun</a>
 * @version ${project.version} - 2023/9/28
 */
@Slf4j
@RestController
@RequestMapping("/user/wx")
public class WxUserEndpoint {

  @Autowired private UserService userService;

  @PostMapping("/login")
  public UserInfoVO login() {
    // todo 没有就需要注册
    // 当前直接mock获取一条用户记录进去
    //    UserInfoVO userInfoVO = new UserInfoVO();
    UserInfoDTO userInfoDTO = userService.getUserInfoByPhone("13405093552");
    return BeanUtil.copyProperties(userInfoDTO, UserInfoVO.class);
  }
}
