package com.ceinet.bean;

public class Person {
    private  String fdName;
    private  Integer fdAge;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "fdName='" + fdName + '\'' +
                ", fdAge=" + fdAge +
                '}';
    }

    public Person(String fdName, Integer fdAge) {
        this.fdName = fdName;
        this.fdAge = fdAge;
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
