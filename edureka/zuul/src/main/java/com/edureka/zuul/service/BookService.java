package com.edureka.zuul.service;

import com.edureka.zuul.domain.Foo;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "instruments")
public class BookService {

//    @Cacheable(condition = "#instrument.equals('instrument')")
    @Cacheable(condition = "#instrument.equals('abc')")
    public Foo getFoo(String instrument) {
        System.out.println("inside BookService.getFoo");
        return new Foo(1, "first");
    }

    @CacheEvict(allEntries = true)
    public void clearCache(){}
}
