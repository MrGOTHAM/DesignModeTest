package com.example.designmode.designMode.builder;

/**
 * Created by anchaoguang on 2019-11-20.
 */
public class PersonTest {

    public static void main(String args[]) {
        Person p = new Person.Builder("安超广", "男")
                .age("23")
                .money("一个亿")
                .car("宝马")
                .build();
        System.out.println(p);
    }
}
