package top.ningg.spring.config;

import javax.annotation.Resource;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.context.ActiveProfiles;
import top.ningg.spring.AbstractTest;
import top.ningg.spring.service.IWrapService;

/**
 * 测试 WrapService 对应的 starter
 */
@ActiveProfiles("wrap-service")
public class WrapServiceConfigurationTest extends AbstractTest {

    @Resource
    private IWrapService wrapService;

    @Test
    public void testWrap() {
        String srcString = "测试";
        String destString = "前缀" + srcString + "后缀";

        // wrap
        String actualString = wrapService.wrap(srcString);

        // assert
        Assert.assertEquals(destString, actualString);
    }
}
