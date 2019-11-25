package com.example.designmode.designMode.builder;

/**
 * Created by anchaoguang on 2019-11-20.
 */
public class Person {
    private final String name;
    private final String gender;
    private final String age;
    private final String shoes;
    private final String clothes;
    private final String money;
    private final String house;
    private final String car;
    private final String career;

    private Person(Builder builder) {
        this.name = builder.name;
        this.gender = builder.gender;
        this.age = builder.age;
        this.shoes = builder.shoes;
        this.clothes = builder.clothes;
        this.money = builder.money;
        this.house = builder.house;
        this.car = builder.car;
        this.career = builder.career;
    }

    @Override
    public String toString() {
        return "name=="+name+" gender=="+gender+" age=="+age+" shoes=="+shoes+" clothes=="+clothes+" money=="+money+" house=="+house+" car=="+car +" career=="+career;
    }

    public static class Builder {
        private final String name;
        private final String gender;
        private String age;
        private String shoes;
        private String clothes;
        private String money;
        private String house;
        private String car;
        private String career;

        Builder(String name, String gender) {
            this.name = name;
            this.gender = gender;
        }

        Builder age(String age) {
            this.age = age;
            return this;
        }

        Builder car(String car) {
            this.car = car;
            return this;
        }

        public Builder shoes(String shoes) {
            this.shoes = shoes;
            return this;
        }

        public Builder clothes(String clothes) {
            this.clothes = clothes;
            return this;
        }

        Builder money(String money) {
            this.money = money;
            return this;
        }

        public Builder house(String house) {
            this.house = house;
            return this;
        }

        public Builder career(String career) {
            this.career = career;
            return this;
        }

        Person build() {
            return new Person(this);
        }
    }
}
