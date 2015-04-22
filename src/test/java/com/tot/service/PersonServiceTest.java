package com.tot.service;

import com.tot.entity.Person;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2015/4/20.
 */
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class PersonServiceTest  extends AbstractTestNGSpringContextTests{
    @Resource
    private PersonService personService;

    @Test
    public void test() throws Exception {
        Person p = personService.findPersonById(1);
        System.out.printf("heihei%s","nimei");
        Assert.assertEquals(p.getName(),"totxx");

    }
}
