package com.tot.entity;

import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2015/4/20.
 */
@Repository
public interface PersonDao {
    public Person findOneById(int id);
}
