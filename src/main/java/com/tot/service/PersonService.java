package com.tot.service;

import com.tot.entity.Person;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2015/4/20.
 */

public interface PersonService {
    public Person findPersonById(int id);
}
