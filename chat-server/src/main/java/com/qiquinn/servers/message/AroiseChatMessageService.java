package com.qiquinn.servers.message;

import com.qiquinn.model.AroiseChatMessage;
import com.qiquinn.servers.base.BaseInitailService;
import com.qiquinn.servers.base.BaseModifyService;
import com.qiquinn.servers.base.BaseModifyServiceImpl;

import java.util.List;
import java.util.Map;

/**
 * @Author:QiQuinn
 * @Desicription:
 * @Date:Created in 2019/8/9
 * @Modified By:
 */

public interface AroiseChatMessageService extends BaseInitailService<AroiseChatMessage>
{
    List<AroiseChatMessage> selectMessage(Map<String,Object> params);
}
