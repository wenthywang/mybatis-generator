package com.ssm.mapper;

import cn.ssm.po.TFenshu;
import cn.ssm.po.TFenshuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TFenshuMapper {
    int countByExample(TFenshuExample example);

    int deleteByExample(TFenshuExample example);

    int deleteByPrimaryKey(Integer fenshuId);

    int insert(TFenshu record);

    int insertSelective(TFenshu record);

    List<TFenshu> selectByExample(TFenshuExample example);

    TFenshu selectByPrimaryKey(Integer fenshuId);

    int updateByExampleSelective(@Param("record") TFenshu record, @Param("example") TFenshuExample example);

    int updateByExample(@Param("record") TFenshu record, @Param("example") TFenshuExample example);

    int updateByPrimaryKeySelective(TFenshu record);

    int updateByPrimaryKey(TFenshu record);
}