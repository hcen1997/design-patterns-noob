package com.github.hcen1997.designpatternsnoob.设计模式入门;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 塑料鸭Test {
    @Test
    public void 池塘(){
        塑料鸭 小红 = new 塑料鸭();
        小红.叫();
        小红.游泳();
        小红.展示();
        小红.飞();
    }
}