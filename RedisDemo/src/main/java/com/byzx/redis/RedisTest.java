package com.byzx.redis;

import redis.clients.jedis.Jedis;

public class RedisTest {
	public static void main(String[] args) {
		Jedis redis= new Jedis("chen",6379);
		redis.set("stu","zhansan");
		System.out.println(redis.ping());
		System.out.println(redis.get("stu"));
	}

}
