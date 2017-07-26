# Spring Cloud Example

## 项目说明

1. config：配置服务器，为person-service和some-service提供外部配置
2. discovery：Eureka Server为微服务提供注册
3. ui：作为应用网关，提供外部访问的唯一入口。 使用Feign消费persion服务、Ribbon消费some服务，且都提供断路器功能
4. person：为UI模块提供保存person的REST服务
5. some：为UI模块返回一段字符串
6. monitor：监控UI模块中的断路

## 启动说明

1. 依次启动discovery、config、ui、some、person、monitor。

## 其他

- [查看eureka](http://localhost:8761)
- [访问UI服务](http://localhost:8080)
- [断路器监控](http://localhost:8989/hystrix.stream) 输入：http://localhost:8080/hystrix.stream 监控

## 参考

《JavaEE开发的颠覆者Spring Boot实战》汪云飞，第12章