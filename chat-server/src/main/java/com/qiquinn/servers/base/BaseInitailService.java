package com.qiquinn.servers.base;

import java.util.List;

/**
 * @Author:QiQuinn
 * @Desicription:
 * @Date:Created in 2019/8/9
 * @Modified By:
 */

public interface BaseInitailService<T>
{
    //增加
    public void insert(T t);
    //查询
    public List<T> select();
    //按id查询
    public T byIdSelect(Integer id);
}
