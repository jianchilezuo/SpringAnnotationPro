package com.ceinet.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PersonLiftCycle3 {
    private  String fdName;
    private  Integer fdAge;

    public PersonLiftCycle3() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "fdName='" + fdName + '\'' +
                ", fdAge=" + fdAge +
                '}';
    }

    public PersonLiftCycle3(String fdName, Integer fdAge) {
        this.fdName = fdName;
        this.fdAge = fdAge;
    }

    @PostConstruct
    public  void  Init(){
        System.out.println("Init");
    }
    @PreDestroy
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
}
