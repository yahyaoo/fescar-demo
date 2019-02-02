package com.demo.provider.mapper;

import com.demo.provider.pojo.po.DmUser;
import com.demo.provider.pojo.po.DmUserExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DmUserMapper {
    int countByExample(DmUserExample example);

    int deleteByExample(DmUserExample example);

    int deleteByPrimaryKey(Integer dmUserId);

    int insert(DmUser record);

    int insertSelective(DmUser record);

    List<DmUser> selectByExample(DmUserExample example);

    DmUser selectByPrimaryKey(Integer dmUserId);

    int updateByExampleSelective(@Param("record") DmUser record, @Param("example") DmUserExample example);

    int updateByExample(@Param("record") DmUser record, @Param("example") DmUserExample example);

    int updateByPrimaryKeySelective(DmUser record);

    int updateByPrimaryKey(DmUser record);
}