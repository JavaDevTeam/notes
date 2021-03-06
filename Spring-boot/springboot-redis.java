------------------------------------
Redis-整合单机版					|
------------------------------------
	1,配置文件
		spring.redis.host=localhost
		spring.redis.port=6379
	
	3,导入依赖
		spring-boot-starter-redis

	2,入口类开启缓存支持
		@EnableCaching
	
	3,在需要的地方使用缓存
		@Cacheable
			# 设置缓存
			# 属性
				value 
					* 指定缓存的key
			# 表示在某个方法,当再次调用该方法的时候,会先去缓存中获取值
		
			
------------------------------------
Redis-整合集群						|
------------------------------------	
	
	
	