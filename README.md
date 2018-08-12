# spring-boot-starter-learn
Spring Boot Starter 实例

## 开发说明

几个方面:

1. 如何发布
2. 如何本地测试

具体操作:

```
# 1. 发布到本地
make install

# 2. 本地运行测试
make test
```


## 使用说明

在 `pom.xml` 中, 增加依赖:

```
<dependency>
    <groupId>top.ningg.spring</groupId>
    <artifactId>learn-spring-boot-starter</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

在 `application.yml` 中, 增加如下配置:

```
wrap:
  service:
    enabled: true
    prefix: 前缀
    suffix: 后缀
```