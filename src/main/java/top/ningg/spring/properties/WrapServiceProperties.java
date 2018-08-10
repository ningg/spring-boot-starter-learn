package top.ningg.spring.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * WrapService 配置的属性.
 */
@ConfigurationProperties("wrap.service")
public class WrapServiceProperties {

    // 前缀
    private String prefix;
    // 后缀
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
