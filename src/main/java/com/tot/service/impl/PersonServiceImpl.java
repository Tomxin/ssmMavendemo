package com.tot.service.impl;

import com.tot.entity.Person;
import com.tot.entity.PersonDao;
import com.tot.service.PersonService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * Created by Administrator on 2015/4/20.
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Resource
    private PersonDao personDao;
    public Person findPersonById( int id) {
        return personDao.findOneById(id);
    }
}
