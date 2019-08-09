package com.qiquinn.servers.friend;

import com.qiquinn.model.AroiseChatFriend;
import com.qiquinn.servers.base.BaseModifyService;
import com.qiquinn.servers.base.BasePageSelectService;

import java.util.List;


/**
 * @Author:QiQuinn
 * @Desicription:
 * @Date:Created in 2019/8/9
 * @Modified By:
 */

public interface AroiseChatFriendService extends BaseModifyService<AroiseChatFriend>,BasePageSelectService<AroiseChatFriend>
{
    List<AroiseChatFriend> getFriend();
}
