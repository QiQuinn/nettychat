package com.qiquinn.dao;

import com.qiquinn.dao.base.BaseMapper;
import com.qiquinn.model.AroiseChatFriend;

import java.util.List;
import java.util.Map;

public interface AroiseChatFriendMapper extends BaseMapper<AroiseChatFriend>
{
    //分页查询
    public List<AroiseChatFriend> byPageSelect(Map<String, Object> map);
}