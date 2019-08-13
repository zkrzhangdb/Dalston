1、启动注册中心
   RegisterCenter
2、启动多个服务 修改端口 eureka-client
3、启动消费者  eureka-consumer
4、启动网关  api-gateway
5、启动检测服务 hystrix-dashboard  访问 http://localhost:1301/hystrix  输入 http://localhost:2101/hystrix.stream
6、启动聚合检测服务 turbine 访问 http://localhost:1301/hystrix  输入 http://localhost:2101/hystrix.stream
访问地址 http://localhost:6666/test/consumer
