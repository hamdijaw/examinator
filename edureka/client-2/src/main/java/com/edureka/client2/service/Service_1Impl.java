package com.edureka.client2.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class Service_1Impl implements Service_1 {

    /*@Autowired
    private Provider ProtoypeBean protoypeBean;*/
//    private ProtoypeBean protoypeBean;

    @Override
    public String getData() {
        return "hello";
//        return protoypeBean.getData();
    }
}
