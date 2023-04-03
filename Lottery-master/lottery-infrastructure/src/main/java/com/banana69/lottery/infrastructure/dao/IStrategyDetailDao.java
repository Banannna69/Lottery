package com.banana69.lottery.infrastructure.dao;

import com.banana69.lottery.infrastructure.po.StrategyDetail;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author banana69
 */
@Mapper
public interface IStrategyDetailDao extends BaseMapper<StrategyDetail> {

}
