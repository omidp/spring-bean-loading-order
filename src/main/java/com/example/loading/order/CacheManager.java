package com.example.loading.order;

import org.springframework.stereotype.Component;

@Component
public class CacheManager {

    CacheLoader cacheLoader;

    public CacheManager(CacheLoader cacheLoader) {
        this.cacheLoader = cacheLoader;
        //This is wrong, never do this inside constructors
        cacheLoader.run();
    }


}
