package com.github.hcen1997.designpatternsnoob.设计模式入门;

import com.github.hcen1997.designpatternsnoob.设计模式入门.绿头鸭;
import org.junit.jupiter.api.Test;

class 绿头鸭Test {
    @Test
    public void 池塘(){
        绿头鸭 小绿 = new 绿头鸭();
        小绿.叫();
        小绿.游泳();
        小绿.展示();
        小绿.飞();
    }
}