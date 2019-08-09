package com.qiquinn.servers.friend;

import com.qiquinn.model.AroiseChatFriend;
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
@Service("friendService")
public class AroiseChatFriendServiceImpl extends BaseModifyServiceImpl<AroiseChatFriend> implements AroiseChatFriendService {

    @Override
    public void update(AroiseChatFriend aroiseChatFriend) {
        aroiseChatFriendMapper.update(aroiseChatFriend);
    }

    @Override
    public void delete(AroiseChatFriend aroiseChatFriend) {
        aroiseChatFriendMapper.update(aroiseChatFriend);
    }

    @Override
    public void insert(AroiseChatFriend aroiseChatFriend) {
        aroiseChatFriendMapper.insert(aroiseChatFriend);
    }

    @Override
    public List<AroiseChatFriend> select() {
        return aroiseChatFriendMapper.select();
    }

    @Override
    public AroiseChatFriend byIdSelect(Integer id) {
        return aroiseChatFriendMapper.byIdSelect(id);
    }

    @Override
    public List<AroiseChatFriend> byPageSelect(Map<String, Object> map) {
        return aroiseChatFriendMapper.byPageSelect(map);
    }

    @Override
    public List<AroiseChatFriend> getFriend() {
        return null;
    }
}
