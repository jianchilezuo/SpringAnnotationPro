package com.ceinet.bean;

public class PersonLiftCycle {
    private  String fdName;
    private  Integer fdAge;

    public PersonLiftCycle() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "fdName='" + fdName + '\'' +
                ", fdAge=" + fdAge +
                '}';
    }

    public PersonLiftCycle(String fdName, Integer fdAge) {
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
}
