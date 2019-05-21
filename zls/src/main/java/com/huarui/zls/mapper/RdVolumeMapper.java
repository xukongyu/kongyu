package com.huarui.zls.mapper;

import com.huarui.zls.pojo.RdVolume;

public interface RdVolumeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RdVolume record);

    int insertSelective(RdVolume record);

    RdVolume selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RdVolume record);

    int updateByPrimaryKey(RdVolume record);
}