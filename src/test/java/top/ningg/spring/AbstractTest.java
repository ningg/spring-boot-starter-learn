package top.ningg.spring;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = TestApplication.class)
@RunWith(SpringRunner.class)
public abstract class AbstractTest {
    // 设定 Spring Boot 的初始配置
}
