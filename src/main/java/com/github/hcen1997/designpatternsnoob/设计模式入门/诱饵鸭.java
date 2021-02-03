package com.github.hcen1997.designpatternsnoob.设计模式入门;

public class 诱饵鸭 extends 鸭子 {
    @Override
    void 叫() {
        // 诱饵鸭不应该会叫
    }

    @Override
    void 展示() {
        System.out.println("我是一只诱饵鸭");
    }

    @Override
    void 飞() {
        // 诱饵鸭不应该会飞
    }
}
