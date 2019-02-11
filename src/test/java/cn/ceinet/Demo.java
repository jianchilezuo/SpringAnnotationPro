package cn.ceinet;

import com.ceinet.bean.Person;
import com.ceinet.bean.PersonLiftCycle2;
import com.ceinet.bean.PersonLiftCycle3;
import com.ceinet.config.Demo1Config;
import com.ceinet.config.DemoConfig;
import com.ceinet.factory.PersonFactoryBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class Demo {
    private ApplicationContext applicationContext = null;

    {
//            applicationContext=new ClassPathXmlApplicationContext("beans.xml");
//        applicationContext=new AnnotationConfigApplicationContext(DemoConfig.class);
        applicationContext = new AnnotationConfigApplicationContext(Demo1Config.class);
    }

    @Test
    public void fun1() {
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person.toString());
    }

    @Test
    public void fun2() {
        applicationContext = new AnnotationConfigApplicationContext(DemoConfig.class);
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person.toString());
    }

    @Test
    public void fun3() {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String string : beanDefinitionNames) {
            System.out.println(string);
        }
    }

    @Test
    public void fun4() {
        Map<String, Person> personMap = applicationContext.getBeansOfType(Person.class);
        System.out.println(personMap.toString());
    }

    @Test
    public void fun5() {
        Object personFactoryBean = applicationContext.getBean("personFactoryBean");
        System.out.println(personFactoryBean.toString());
    }

    @Test
    public void fun6() {
        PersonFactoryBean personFactoryBean = applicationContext.getBean(PersonFactoryBean.class);
        System.out.println(personFactoryBean.toString());
    }

    @Test
    public void fun7() {
        PersonLiftCycle2 personLiftCycle2 = applicationContext.getBean(PersonLiftCycle2.class);
        System.out.println(personLiftCycle2.toString());
    }
    @Test
    public void fun8() {
        PersonLiftCycle3 personLiftCycle3 = applicationContext.getBean(PersonLiftCycle3.class);
        System.out.println(personLiftCycle3.toString());
    }
    @Test
    public  void  fun9(){

    }
}
