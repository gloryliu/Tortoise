package com.glory.tortoise.mapper;

import java.util.List;

/**
 * @author liuzhenrong
 * @email liuzhenrong008@gmail.com
 * @create 2017-06-18 11:22
 **/
public interface BaseMapper<T> {

    /**
     * 新增一个实例
     * @param entity 要新增的实例
     */
    int save(T entity);

    /**
     * 根据主键删除一个实例
     * @param id 对象
     */
    int delete(int id);

    /**
     * 编辑指定实例的详细信息
     * @param entity 实例
     */
    int update(T entity);

    /**
     * 根据主键获取对应的实例
     * @param id 主键值
     * @return 如果查询成功，返回符合条件的实例;如果查询失败，返回null
     */
    T getDetail(int id);


    /**
     * 获取所有实体实例列表
     * @return 符合条件的实例列表
     */
    List<T> findAll();

}
