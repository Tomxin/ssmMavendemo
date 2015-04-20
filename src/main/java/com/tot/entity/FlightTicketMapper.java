package com.tot.entity;

import com.tot.entity.FlightTicket;

public interface FlightTicketMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FlightTicket record);

    int insertSelective(FlightTicket record);

    FlightTicket selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FlightTicket record);

    int updateByPrimaryKey(FlightTicket record);
}