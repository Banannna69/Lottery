package com.banana69.lottery.infrastructure.dao;

import com.banana69.lottery.infrastructure.po.Strategy;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IStrategyDao extends BaseMapper<Strategy> {
}
