package io.gffd94.grepp_spring_aop.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Proxy implements Subject {

    private RealSubject targetObject;

    public Proxy(RealSubject targetObject) {
        this.targetObject = targetObject;
    }

    @Override
    public void operation() {
        //전처리로직
        log.info("[prefix]proxy operation");
        targetObject.operation();
        log.info("[postfix]proxy operation");
    }
}
