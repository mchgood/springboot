package com.tangkc.demo03.Exercise;

/**
 * @Auther: lenovo
 * @Date: 2019-05-12 21:27
 * @Description:
 */
public class Person {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
