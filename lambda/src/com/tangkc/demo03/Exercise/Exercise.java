package com.tangkc.demo03.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Auther: lenovo
 * @Date: 2019-05-12 21:26
 * @Description:
 */
public class Exercise {
    /**
     * 1. 第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中。
     * 2. 第一个队伍筛选之后只要前3个人；存储到一个新集合中。
     * 3. 第二个队伍只要姓张的成员姓名；存储到一个新集合中。
     * 4. 第二个队伍筛选之后不要前2个人；存储到一个新集合中。
     * 5. 将两个队伍合并为一个队伍；存储到一个新集合中。
     * 6. 根据姓名创建 Person 对象；存储到一个新集合中。
     * 7. 打印整个队伍的Person对象信息。
     */
    public static void method(List<String> listA,List<String> listB){
        List<Person> list = new ArrayList<>();
        Stream<String> streamA = listA.stream().filter((String name) -> {
            return name.length() == 3;
        }).limit(3);

        Stream<String> streamB = listB.stream().filter((String name) -> {
            return name.startsWith("张");
        }).skip(2);

        Stream.concat(streamA,streamB).map((String name)->{
            return new Person(name);
        }).forEach((Person p)->{
            list.add(p);
        });
        System.out.println(list);

    }
    public static void main(String[] args) {
        List<String> listA = new ArrayList<>();
        listA.add("迪丽热巴");
        listA.add("宋远桥");
        listA.add("苏星河");
        listA.add("石破天");
        listA.add("石中玉");
        listA.add("老子");
        listA.add("庄子");
        listA.add("洪七公");

        List<String> listB = new ArrayList<>();
        listB.add("古力娜扎");
        listB.add("张无忌");
        listB.add("赵丽颖");
        listB.add("张三丰");
        listB.add("尼古拉斯赵四");
        listB.add("张天爱");
        listB.add("张二狗");

        method(listA,listB);
    }
}
