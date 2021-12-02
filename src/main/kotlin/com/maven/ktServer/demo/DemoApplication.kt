package com.maven.ktServer.demo

import com.maven.ktServer.demo.config.FileStorageProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(value = [FileStorageProperties::class])
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
