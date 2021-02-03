package com.github.hcen1997.designpatternsnoob.设计模式入门;

public class 塑料鸭 extends 鸭子 {

    @Override
    void 叫() {
        System.out.println("咯吱咯吱");
    }

    @Override
    void 展示() {
        System.out.println("我是一只塑料做的鸭子");
    }

    @Override
    void 飞() {
        // 塑料鸭子不应该会飞
    }
}
