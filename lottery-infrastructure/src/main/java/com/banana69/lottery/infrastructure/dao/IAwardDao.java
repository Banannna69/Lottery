package com.banana69.lottery.infrastructure.dao;

import com.banana69.lottery.infrastructure.po.Award;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author banana69
 */
@Mapper
public interface IAwardDao extends BaseMapper<Award> {

    void insertList(List<Award> req);
}
