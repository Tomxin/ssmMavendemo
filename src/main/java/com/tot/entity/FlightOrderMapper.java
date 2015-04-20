package com.tot.entity;

import com.tot.entity.FlightOrder;

public interface FlightOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FlightOrder record);

    int insertSelective(FlightOrder record);

    FlightOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FlightOrder record);

    int updateByPrimaryKeyWithBLOBs(FlightOrder record);

    int updateByPrimaryKey(FlightOrder record);
}