package io.gffd94.grepp_spring_aop.virtual_proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClothesProvider implements SupplementProvider{

    @Override
    public String provide() {
        log.info("생산자가 구매자에게 옷을 보냅니다.");
        return "Stussy";
    }
}
