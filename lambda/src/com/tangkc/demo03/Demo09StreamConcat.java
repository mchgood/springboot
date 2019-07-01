package com.tangkc.demo03;

import java.util.stream.Stream;

/**
 * @Auther: lenovo
 * @Date: 2019-05-12 21:22
 * @Description:
 */
public class Demo09StreamConcat {
    public static void main(String[] args) {
        Stream<String> streamA = Stream.of("1", "2");
        Stream<String> streamB = Stream.of("3", "4");
        Stream.concat(streamA,streamB).forEach((num)->{
            System.out.println(num);
        });
    }
}
