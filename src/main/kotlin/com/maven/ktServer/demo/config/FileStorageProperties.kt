package com.maven.ktServer.demo.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "file")
class FileStorageProperties() {
    lateinit var uploadDir:String
}