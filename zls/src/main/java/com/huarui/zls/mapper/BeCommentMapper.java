package com.huarui.zls.mapper;

import com.huarui.zls.pojo.BeComment;

public interface BeCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BeComment record);

    int insertSelective(BeComment record);

    BeComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BeComment record);

    int updateByPrimaryKey(BeComment record);
}