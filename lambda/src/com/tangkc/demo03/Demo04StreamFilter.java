package com.tangkc.demo03;

import java.util.stream.Stream;

/**
 * @Auther: lenovo
 * @Date: 2019-05-12 21:11
 * @Description:
 */
public class Demo04StreamFilter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3");
        stream.filter((String num)->{
            return "2".equals(num);
        }).forEach((String num)->{
            System.out.println(num);
        });
    }
}
