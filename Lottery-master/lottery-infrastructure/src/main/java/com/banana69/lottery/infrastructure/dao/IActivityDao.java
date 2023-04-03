package com.banana69.lottery.infrastructure.dao;

import com.banana69.lottery.infrastructure.po.Activity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author banana69
 */
@Mapper
public interface IActivityDao extends BaseMapper<Activity> {

    Activity queryActivityById(@Param("activityId") Long activityId);

}