package com.limit.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.limit.entity.LimitType;

/**
 * 限流 <br>
 * 版权：Copyright (c) 2016-2019<br>
 * 作者：孙常军<br>
 * 版本：1.0<br>
 * 创建日期：2019年3月29日<br>
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Limit {

	/**
	 * 资源的名字
	 *
	 * @return String
	 */
	String name() default "";

	/**
	 * 资源的key
	 *
	 * @return String
	 */
	String key() default "";

	/**
	 * Key的prefix
	 *
	 * @return String
	 */
	String prefix() default "";

	/**
	 * 给定的时间段 单位秒
	 *
	 * @return int
	 */
	int period();

	/**
	 * 最多的访问限制次数
	 *
	 * @return int
	 */
	int count();

	/**
	 * 类型
	 *
	 * @return LimitType
	 */
	LimitType limitType() default LimitType.CUSTOMER;
}
