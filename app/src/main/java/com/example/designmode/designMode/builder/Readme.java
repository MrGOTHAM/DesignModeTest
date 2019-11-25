package com.example.designmode.designMode.builder;

/**
 * 变种的Builder模式：
 * （1）在Person类中定义字段名
 * （2）写一个Person的构造器，传入的对象是builder，构造器内将值全部赋给之前定义的字段名
 * （3）写一个静态内部类Builder类，里面定义person中所有字段
 * （4）由于name字段和 gender字段是必须赋值的，因此写一个Builder的构造器，传的是name和gender
 * （5）其他字段均由 各自 有参数有返回值的方法提供赋值操作
 * （6）定义一个person类返回值的函数
 * （7）可以进行链式调用了
 */