package com.ceinet.config;

import com.ceinet.bean.Person;
import com.ceinet.dao.PersonDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


//包扫描
@ComponentScan(value = "com.ceinet" ,
        useDefaultFilters = false,
        //不包含
        excludeFilters ={@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Repository.class})},
        //包含
        includeFilters={@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Service.class),
          @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = PersonDao.class)
         }

        )
@Configuration
public class DemoConfig {
    //给容器注册一个bean
    @Bean("person")
    public Person person01(){
        return  new Person("person01lisi",20);
    }

    //给容器注册一个bean
    @Bean
    public Person person(){
        return  new Person("lisi",20);
    }

}
