package io.gffd94.grepp_spring_aop.virtual_proxy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Slf4j
public class SupplementTests {
    @Test
    @DisplayName("프록시 패턴 예제 1")
    void test1() throws Exception {

        ClothesProvider clothesProvider = new ClothesProvider();
        ClothesDistributor proxy = new ClothesDistributor(clothesProvider);


        proxy.provide();
        proxy.provide();
        proxy.provide();
        proxy.provide();


    }
}
