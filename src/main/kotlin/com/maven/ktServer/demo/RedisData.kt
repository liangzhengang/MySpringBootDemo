package com.maven.ktServer.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.redis.core.RedisTemplate
import java.time.Duration

class RedisData {
    @Autowired
    lateinit var redisTemplate: RedisTemplate<String, String>

    fun saveString(key: String, value: String) {
        redisTemplate.opsForValue().set(key, value)
    }


    fun saveStringWithExpire(key: String, value: String, expireSecond: Long) {
        redisTemplate.opsForValue().set(key, value, Duration.ofSeconds(expireSecond))
    }

    fun getString(key: String): String? {
        return redisTemplate.opsForValue().get(key)
    }
}