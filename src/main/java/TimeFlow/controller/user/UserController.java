package TimeFlow.controller.user;

import TimeFlow.config.GetUserId;
import TimeFlow.pojo.interact.Result;
import TimeFlow.pojo.User;
import TimeFlow.service.interf.user.UserService;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 用户注销方法
     *
     * @param uid 从token解析的uid
     * @return 删除结果
     */
    @DeleteMapping()
    public Result userDelete(@GetUserId Integer uid) {

        // 判断uid是否为空
        if (uid == null)
            return Result.error("无效登录（请求uid为空）");

        // 删除用户是否成功
        if (userService.userDelete(uid)) {
            // 删除成功
            return Result.success();
        } else {
            return Result.error("找不到该用户");
        }
    }

    /**
     * 用户信息修改方法
     *
     * @param uid  解析参数uid，从token中取得
     * @param user 要更新的用户信息实体类
     * @return 更新结果
     */
    @PatchMapping()
    public Result userUpdate(@GetUserId Integer uid, @RequestBody User user) {

        // 判断uid是否为空
        if (uid == null)
            return Result.error("无效请求（请求uid为空）");

        // 对传入数据进行校验
        if (!StringUtils.hasText(user.getName()) &&
                !StringUtils.hasText(user.getPassword()))
            return Result.error("无效请求（请求更新数据为空）");

        // 注入uid
        user.setUid(uid);

        // 执行更新
        if (userService.userUpdate(user)) {
            return Result.success();
        } else {
            return Result.error("修改失败，用户名重复");
        }
    }
}
