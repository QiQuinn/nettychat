package com.qiquinn.servers.request;

import com.qiquinn.model.AroiseChatMessageRequest;
import com.qiquinn.servers.base.BaseInitailServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:QiQuinn
 * @Desicription:
 * @Date:Created in 2019/8/9
 * @Modified By:
 */
@Service("requestService")
public class AroiseChatMessageRequestModifyServiceImpl extends BaseInitailServiceImpl<AroiseChatMessageRequest> implements AroiseChatMessageRequestService
{
    @Override
    public void insert(AroiseChatMessageRequest aroiseChatMessageRequest) {
        requestMapper.insert(aroiseChatMessageRequest);
    }

    @Override
    public List<AroiseChatMessageRequest> select() {
        return requestMapper.select();
    }

    @Override
    public AroiseChatMessageRequest byIdSelect(Integer id) {
        return requestMapper.byIdSelect(id);
    }
}
