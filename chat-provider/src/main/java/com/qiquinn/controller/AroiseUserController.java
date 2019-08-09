package com.qiquinn.controller;

import com.qiquinn.model.AroiseChatUser;
import com.qiquinn.model.result.RequestResult;
import com.qiquinn.servers.user.AroiseChatUserModifyServiceImpl;
import com.qiquinn.servers.user.AroiseChatUserService;
import com.qiquinn.utils.MD5Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:QiQuinn
 * @Desicription:
 * @Date:Created in 2019/8/9
 * @Modified By:
 */
@RestController
@RequestMapping("/user")
public class AroiseUserController
{
    @Autowired
    private AroiseChatUserService userService;

    private Logger log = LoggerFactory.getLogger(AroiseUserController.class);
    @RequestMapping("/hello")
    @ResponseBody
    public Map<String,String> he()
    {
        Map<String,String> result = new HashMap<>();
        result.put("user","123123121");
        return result;
    }
    @PostMapping("/login")
    @ResponseBody
    public RequestResult login(@RequestBody AroiseChatUser user)
    {
        log.info("登陆请求: "+user.toString());
        if(user.getUserName().isEmpty() || user.getUserPassword().isEmpty()) {
            return new RequestResult(-1, "请输入用户名密码...");
        }else
        {
            try
            {
                return userService.login(user.getUserName(), user.getUserPassword() );
            }
            catch (Exception e)
            {
               log.error(" MD5加密错误",e);
               return new RequestResult(-1,"MD5加密错误",e);
            }
        }
    }

    @PostMapping("/regist")
    @ResponseBody
    public RequestResult register(@RequestBody AroiseChatUser user)
    {
        return userService.register(user);
    }
}
