package com.github.hcen1997.designpatternsnoob.设计模式入门.v1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 绿头鸭Test {
    @Test
    public void 池塘(){
        绿头鸭 小绿 = new 绿头鸭();
        小绿.叫();
        小绿.游泳();
        小绿.展示();
    }
}