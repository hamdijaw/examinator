package com.edureka.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EnableCaching
public class ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}

//	@Bean
//	public CacheManager cacheManager() {
//		return new EhCacheCacheManager(ehCacheCacheManager().getObject());
//	}
//
//	@Bean
//	public EhCacheManagerFactoryBean ehCacheCacheManager() {
//		EhCacheManagerFactoryBean cmfb = new EhCacheManagerFactoryBean();
//		cmfb.setConfigLocation(new ClassPathResource("ehcache.xml"));
//		cmfb.setShared(true);
//		return cmfb;
//	}
}
