# spring-boot-starter-learn
Spring Boot Starter 实例

## 场景说明

当前工程, 就是学习 Spring Boot Starter 的一个样例工程。

具体要实现的场景:

> 实现一个 WrapService：
>
> 1. 对输入的 `字符串`， 增加 `前缀`和`后缀`
> 2. `前缀`和`后缀` 在不同环境中，可以进行差异化配置
> 3. 有些环境初始化 WrapService，有些环境不初始化


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

## 关联资料

* [Spring Boot 系列：Spring Boot Starter](http://ningg.top/spring-boot-series-01-spring-boot-starter/)