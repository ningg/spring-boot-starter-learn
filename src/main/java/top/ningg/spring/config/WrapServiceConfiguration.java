package top.ningg.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.ningg.spring.properties.WrapServiceProperties;
import top.ningg.spring.service.IWrapService;
import top.ningg.spring.service.impl.WrapServiceImpl;

/**
 * WrapService 的配置对象
 */
@Configuration
@ConditionalOnClass(WrapServiceImpl.class)
@EnableConfigurationProperties(WrapServiceProperties.class)
public class WrapServiceConfiguration {

    @Autowired
    private WrapServiceProperties properties;

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "wrap.service", value = "enabled", havingValue = "true")
    IWrapService wrapService() {
        return new WrapServiceImpl(properties.getPrefix(), properties.getSuffix());
    }


}
