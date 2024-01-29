package com.example.loading.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@DependsOn("cacheManager")
public class AfterLoadingCacheService implements InitializingBean {

    public void init(){
      log.info(" You should see this log at the end of processing logs inside cache loader ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        init();
    }
}
