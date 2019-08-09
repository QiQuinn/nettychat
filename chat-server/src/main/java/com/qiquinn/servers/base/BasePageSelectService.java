package com.qiquinn.servers.base;

import java.util.List;
import java.util.Map;

/**
 * @Author:QiQuinn
 * @Desicription:
 * @Date:Created in 2019/8/9
 * @Modified By:
 */

public interface BasePageSelectService<T>
{
    //分页查询
    List<T> byPageSelect(Map<String, Object> map);
}
