package com.magicalcoder.youyamvc.app.teacher.service;

import com.magicalcoder.youyamvc.app.model.Teacher;
import java.util.List;
import java.util.Map;

/**
* Created by www.magicalcoder.com
* 如果你改变了此类 read 请将此行删除
* 799374340@qq.com
*/
public interface TeacherService{

    /**
    * 根据主键获取实体
    * @param id 主键
    * @return
    */
    Teacher getTeacher(Long id);

    /**
    * 调用mybatis selectOne 如果查询返回超过1条 就会发生异常 请自行处理
    * @param query 入参 调用MapUtil构造
    * @return
    */
    Teacher selectOneTeacherWillThrowException(Map<String, Object> query);

    /**
    * 查询实体集合
    * @param query
    * @return
    */
    List<Teacher> getTeacherList(Map<String, Object> query);

    /**
    * 查询实体集合的个数
    * @param query
    * @return
    */
    Integer getTeacherListCount(Map<String, Object> query);

    /**
    * 保存实体 保证entity 主键为空
    * @param entity
    * @return
    */
    Long  insertTeacher(Teacher entity);
    /**
    * 更新实体 保证实体中的主键不为空
    * @param entity
    */
    void updateTeacher(Teacher entity);

    /**
    * 更新实体 自定义条件
    * @param entity   not empty
    * @param whereSql not blank 有sql注入风险 请开发人员自行保证安全性
    */
    void updateTeacherByWhereSql(Map<String,Object> entity,String whereSql);

    /**
    * 根据主键删除实体
    * @param id
    */
    void deleteTeacher(Long id);
    /**
    * 删除实体
    * @param entity 如果字段值不为空 将作为查询条件
    */
    void deleteTeacherList(Map<String,Object> entity);

    /**
    * 根据自定义条件删除实体
    * @param whereSql not blank  有sql注入风险 请开发人员自行保证安全性
    */
    void deleteTeacherByWhereSql(String whereSql);


    /**
    * 清空实体表
    */
    void truncateTeacher();

    /**
    *  批量保存实体，保证list中的实体 主键为空
    * @param list
    */
    void batchInsertTeacher(List<Teacher> list);

    /**
    * 批量更新实体 保证list中的实体 主键不为空
    * @param list
    */
    void batchUpdateTeacher(List<Teacher> list);
    /**
    * 根据主键list 批量删除实体
    * @param idList
    */
    void batchDeleteTeacher(List<Long> idList);
    /**
    * 根据主键list 批量删除实体
    * @param entityList 如果字段值不为空 将作为查询条件
    */
    void batchDeleteTeacherList(List<Teacher> entityList);

    /**
    * 事务保证 导入json文件成功
    * @param list json反序列化后的文件
    * @return
    */
    void transactionImportJsonList(List<Teacher> list);

}
