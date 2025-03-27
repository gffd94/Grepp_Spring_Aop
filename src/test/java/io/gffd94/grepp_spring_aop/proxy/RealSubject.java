package io.gffd94.grepp_spring_aop.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealSubject implements Subject {
    public void operation() {
        log.info("RealSubject operation");
        log.info("ACTION");
    }
}
