package io.gffd94.grepp_spring_aop.virtual_proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClothesDistributor implements SupplementProvider {

    private ClothesProvider clothesProvider;
    private String clothes;

    public ClothesDistributor(ClothesProvider clothesProvider) {
        this.clothesProvider = clothesProvider;
    }

    @Override
    public String provide() {

        log.info("유통업체가 주문을 받았습니다.");

        if(clothes == null) {
            log.info("보유하고 있는 재고가 없습니다.");
            clothes = clothesProvider.provide();
        }

        log.info("재고를 송부합니다.");

        return clothes;
    }
}
