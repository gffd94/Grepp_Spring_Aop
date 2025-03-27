package io.gffd94.grepp_spring_aop.proxy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProxyPatternBasicTests {
    @Test
    @DisplayName("프록시패턴 1")
    void test1() throws Exception {

        RealSubject originSub = new RealSubject();
        Proxy proxy = new Proxy(originSub);
        proxy.operation();

    }
}
