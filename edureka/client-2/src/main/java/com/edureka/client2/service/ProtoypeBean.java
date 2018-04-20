package com.edureka.client2.service;

import java.util.concurrent.atomic.AtomicInteger;

/*@Component
@Lazy
@Scope(value = "prototype")*/
public class ProtoypeBean {

    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    public ProtoypeBean() {
        System.out.println("Constructor ProtoypeBean: " + atomicInteger.incrementAndGet());
    }

    public String getData() {
        return "data: " + atomicInteger.get();
    }
}
