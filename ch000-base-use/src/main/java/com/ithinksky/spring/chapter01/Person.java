package com.ithinksky.spring.chapter01;

/**
 * 用户bean定义
 *
 * @author tengpeng.gao
 * @since 2018/8/7
 */
public class Person {
    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" + "username='" + username + '\'' + ", age=" + age + '}';
    }

    private String username;

    private int age;

    public Person(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
