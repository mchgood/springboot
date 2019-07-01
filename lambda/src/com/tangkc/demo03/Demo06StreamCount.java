package com.tangkc.demo03;

import java.util.stream.Stream;

/**
 * @Auther: lenovo
 * @Date: 2019-05-12 21:19
 * @Description:
 */
public class Demo06StreamCount {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3");
        long count = stream.count();
        System.out.println(count);
    }
}
