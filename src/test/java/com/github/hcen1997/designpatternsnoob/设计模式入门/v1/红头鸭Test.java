package com.github.hcen1997.designpatternsnoob.设计模式入门.v1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 红头鸭Test {
    @Test
    public void 池塘(){
        红头鸭 小红 = new 红头鸭();
        小红.叫();
        小红.游泳();
        小红.展示();
    }
}