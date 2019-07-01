package com.tangkc.demo03;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: lenovo
 * @Date: 2019-05-12 20:29
 * @Description:
 * 1. 首先筛选所有姓张的人；
 * 2. 然后筛选名字有三个字的人；
 * 3. 最后进行对结果进行打印输出
 */
public class Demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        list.stream().filter((name)->{
            return name.startsWith("张");
        }).filter((name)->{
            return name.length()>=3;
        }).forEach((name)->{
            System.out.println(name);
        });
    }
}
