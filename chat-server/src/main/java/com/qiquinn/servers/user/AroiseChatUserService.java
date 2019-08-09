package com.qiquinn.servers.user;

import com.qiquinn.model.AroiseChatUser;
import com.qiquinn.model.result.RequestResult;
import com.qiquinn.servers.base.BaseInitailService;

/**
 * @Author:QiQuinn
 * @Desicription: 用户服务server层接口
 * @Date:Created in 2019/8/9
 * @Modified By:
 */
public interface AroiseChatUserService extends BaseInitailService<AroiseChatUser>
{
    RequestResult login(String username, String password);
    RequestResult logout(AroiseChatUser user);
    RequestResult modifyUserData(AroiseChatUser user);
    RequestResult register(AroiseChatUser user);
}
