package com.github.hcen1997.designpatternsnoob.设计模式入门;

import com.github.hcen1997.designpatternsnoob.设计模式入门.红头鸭;
import org.junit.jupiter.api.Test;

class 红头鸭Test {
    @Test
    public void 池塘(){
        红头鸭 小红 = new 红头鸭();
        小红.叫();
        小红.游泳();
        小红.展示();
        小红.飞();
    }
}