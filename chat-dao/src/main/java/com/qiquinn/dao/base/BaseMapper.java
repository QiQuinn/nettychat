package com.qiquinn.dao.base;


import java.util.List;

/**
 * @Author:QiQuinn
 * @Desicription:
 * @Date:Created in 2019/8/8
 * @Modified By:
 */
public interface BaseMapper<T> {
    //增加
    void insert(T t);
    //删除
    void delete(T t);
    //修改
    void update(T t);
    //查询
    List<T> select();
    //按id查询
    T byIdSelect(Integer id);
}
