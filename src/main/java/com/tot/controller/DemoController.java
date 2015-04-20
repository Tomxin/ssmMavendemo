package com.tot.controller;

import com.tot.entity.Person;
import com.tot.entity.PersonDao;
import com.tot.service.PersonService;
import com.tot.service.impl.PersonServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2015/4/20.
 */
@Controller
@RequestMapping("/tot")
public class DemoController {
    @Resource
    private PersonService personService;
    @RequestMapping("/demo.form")
    public String demoAction(){
        Person person =  personService.findPersonById(1);
        System.out.println("xixixixixixixixxi");
        System.out.println(person.getName());

        return "demo";

    }
}
