package com.qiquinn.dao;


import com.qiquinn.dao.base.BaseMapper;
import com.qiquinn.model.AroiseChatMessage;

import java.util.List;
import java.util.Map;

public interface AroiseChatMessageMapper extends BaseMapper<AroiseChatMessage> {
    //分页查询
    public List<AroiseChatMessage> byPageSelect(Map<String, Object> map);
}