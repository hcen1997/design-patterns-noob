package com.github.hcen1997.designpatternsnoob.设计模式入门.v1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 鸭子Test {
    @Test
    public void 池塘(){
        鸭子 小黄 = new 鸭子();
        小黄.叫();
        小黄.游泳();
        小黄.展示();
    }

}