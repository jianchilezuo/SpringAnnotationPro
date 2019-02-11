package com.ceinet.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PersonLiftCycle2 implements InitializingBean, DisposableBean {
    private  String fdName;
    private  Integer fdAge;

    public PersonLiftCycle2() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "fdName='" + fdName + '\'' +
                ", fdAge=" + fdAge +
                '}';
    }

    public PersonLiftCycle2(String fdName, Integer fdAge) {
        this.fdName = fdName;
        this.fdAge = fdAge;
    }

    public  void  Init(){
        System.out.println("Init");
    }
    public  void  Destory(){

        System.out.println("Destory");
    }
    public String getFdName() {
        return fdName;
    }

    public void setFdName(String fdName) {
        this.fdName = fdName;
    }

    public Integer getFdAge() {
        return fdAge;
    }

    public void setFdAge(Integer fdAge) {
        this.fdAge = fdAge;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }
}
