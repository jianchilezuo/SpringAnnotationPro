package com.ceinet.config;

import com.ceinet.bean.Person;
import com.ceinet.bean.PersonLiftCycle;
import com.ceinet.bean.PersonLiftCycle2;
import com.ceinet.bean.PersonLiftCycle3;
import com.ceinet.dao.PersonDao;
import com.ceinet.factory.PersonFactoryBean;
import com.ceinet.service.PersonService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@ComponentScan("com.ceinet")
@Configuration
public class Demo1Config {
    //给容器注册一个bean
    @Bean("person")
    @Scope
    public Person person01() {
        return new Person("person01lisi", 20);
    }

    //给容器注册一个bean
    @Bean
    @Conditional(MyCondition.class)
    public Person person() {
        return new Person("lisi", 20);
    }


    @Bean("personFactoryBean")
    public PersonFactoryBean personFactoryBean() {
        return new PersonFactoryBean();
    }

    @Bean(initMethod = "Init", destroyMethod = "Destory")
    public PersonLiftCycle personLiftCycle() {
        return new PersonLiftCycle("personLiftCycle", 2);
    }

    @Bean()
    public PersonLiftCycle2 personLiftCycle2() {
        return new PersonLiftCycle2("personLiftCycle", 2);
    }

    @Bean
    public PersonLiftCycle3 personLiftCycle3() {

        return new PersonLiftCycle3("personLiftCycle3", 4);
    }
}
