package com.tangkc.demo03;

import java.util.stream.Stream;

/**
 * @Auther: lenovo
 * @Date: 2019-05-12 21:21
 * @Description:
 */
public class Demo08StreamSkip {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3");
        stream.skip(2).forEach((num)->{
            System.out.println(num);
        });
    }
}
