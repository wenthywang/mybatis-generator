package com.ssm.mapper;

import cn.ssm.po.TQian;
import cn.ssm.po.TQianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TQianMapper {
    int countByExample(TQianExample example);

    int deleteByExample(TQianExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TQian record);

    int insertSelective(TQian record);

    List<TQian> selectByExample(TQianExample example);

    TQian selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TQian record, @Param("example") TQianExample example);

    int updateByExample(@Param("record") TQian record, @Param("example") TQianExample example);

    int updateByPrimaryKeySelective(TQian record);

    int updateByPrimaryKey(TQian record);
}