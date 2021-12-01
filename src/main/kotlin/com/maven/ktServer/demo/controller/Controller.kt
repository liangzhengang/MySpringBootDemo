package com.maven.ktServer.demo.controller

import com.maven.ktServer.demo.RedisData
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {
    @GetMapping("/")
    fun home(): String {
        val redis = RedisData()
        redis.saveString("timestamp", System.currentTimeMillis().toString())
        val time = redis.getString("timestamp")
        return "Hello world gradle springboot:${time}"
    }
}