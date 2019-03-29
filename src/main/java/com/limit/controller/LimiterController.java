package com.limit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.limit.annotation.Limit;

/**
 * 
 * 测试控制类<br>
 * 版权：Copyright (c) 2016-2019<br>
 * 作者：孙常军<br>
 * 版本：1.0<br>
 * 创建日期：2019年3月29日<br>
 */
@RestController
public class LimiterController {

	// 意味着100S内最多可以访问10次
	@Limit(key = "test", period = 100, count = 10)
	@GetMapping("/test")
	public String testLimiter() {
		return "success";
	}
}
