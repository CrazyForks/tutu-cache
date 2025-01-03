package io.github.tri5m.tucache.autoconfigure.configure.cache;

import io.github.tri5m.tucache.autoconfigure.configure.TuCacheCondition;
import io.github.tri5m.tucache.core.cache.TuCacheService;
import io.github.tri5m.tucache.core.cache.impl.LocalCacheService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * @title: LocalCacheServiceConfigure 本地自定义缓存
 * @author: trifolium.wang
 * @date: 2023/9/19
 * @modified :
 */
@Slf4j
@Conditional(TuCacheCondition.class)
public class LocalCacheServiceConfigure {

    @Bean("localTuCacheService")
    public TuCacheService localTuCacheService() {

        log.debug("Injected with LocalTuCacheService");

        return new LocalCacheService();
    }
}
