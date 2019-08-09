package com.qiquinn.servers.message;

import com.qiquinn.model.AroiseChatMessage;
import com.qiquinn.servers.base.BaseModifyServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author:QiQuinn
 * @Desicription:
 * @Date:Created in 2019/8/9
 * @Modified By:
 */
@Service("messageService")
public class AroiseChatMessageServiceImpl extends BaseModifyServiceImpl<AroiseChatMessage> implements AroiseChatMessageService {
    @Override
    public void update(AroiseChatMessage aroiseChatMessage) {
        aroiseChatMessageMapper.update(aroiseChatMessage);
    }

    @Override
    public void delete(AroiseChatMessage aroiseChatMessage) {
        aroiseChatMessageMapper.delete(aroiseChatMessage);
    }

    @Override
    public void insert(AroiseChatMessage aroiseChatMessage) {
        aroiseChatMessageMapper.insert(aroiseChatMessage);
    }

    @Override
    public List<AroiseChatMessage> select() {
        return aroiseChatMessageMapper.select();
    }

    @Override
    public AroiseChatMessage byIdSelect(Integer id) {
        return aroiseChatMessageMapper.byIdSelect(id);
    }

    @Override
    public List<AroiseChatMessage> selectMessage(Map<String, Object> params) {
        return aroiseChatMessageMapper.byPageSelect(params);
    }
}
