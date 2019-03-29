package com.limit.config;

import java.io.Serializable;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * 
 * Redis配置类 <br>
 * 版权：Copyright (c) 2016-2019<br>
 * 作者：孙常军<br>
 * 版本：1.0<br>
 * 创建日期：2019年3月29日<br>
 */
@Configuration
public class RedisConfig {

	@Bean
	public RedisTemplate<String, Serializable> limitRedisTemplate(LettuceConnectionFactory redisConnectionFactory) {
		RedisTemplate<String, Serializable> template = new RedisTemplate<>();
		template.setKeySerializer(new StringRedisSerializer());
		template.setValueSerializer(new GenericJackson2JsonRedisSerializer());// 设置值序列化
		template.setConnectionFactory(redisConnectionFactory);
		return template;
	}

}
