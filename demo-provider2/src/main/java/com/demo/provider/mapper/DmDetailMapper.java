package com.demo.provider.mapper;

import com.demo.provider.pojo.po.DmDetail;
import com.demo.provider.pojo.po.DmDetailExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DmDetailMapper {
    int countByExample(DmDetailExample example);

    int deleteByExample(DmDetailExample example);

    int deleteByPrimaryKey(Integer dmDetailId);

    int insert(DmDetail record);

    int insertSelective(DmDetail record);

    List<DmDetail> selectByExample(DmDetailExample example);

    DmDetail selectByPrimaryKey(Integer dmDetailId);

    int updateByExampleSelective(@Param("record") DmDetail record, @Param("example") DmDetailExample example);

    int updateByExample(@Param("record") DmDetail record, @Param("example") DmDetailExample example);

    int updateByPrimaryKeySelective(DmDetail record);

    int updateByPrimaryKey(DmDetail record);
}