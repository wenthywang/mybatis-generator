package com.ssm.mapper;

import cn.ssm.po.TJiaoyuan;
import cn.ssm.po.TJiaoyuanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TJiaoyuanMapper {
    int countByExample(TJiaoyuanExample example);

    int deleteByExample(TJiaoyuanExample example);

    int deleteByPrimaryKey(Integer jiaojuanId);

    int insert(TJiaoyuan record);

    int insertSelective(TJiaoyuan record);

    List<TJiaoyuan> selectByExample(TJiaoyuanExample example);

    TJiaoyuan selectByPrimaryKey(Integer jiaojuanId);

    int updateByExampleSelective(@Param("record") TJiaoyuan record, @Param("example") TJiaoyuanExample example);

    int updateByExample(@Param("record") TJiaoyuan record, @Param("example") TJiaoyuanExample example);

    int updateByPrimaryKeySelective(TJiaoyuan record);

    int updateByPrimaryKey(TJiaoyuan record);
}