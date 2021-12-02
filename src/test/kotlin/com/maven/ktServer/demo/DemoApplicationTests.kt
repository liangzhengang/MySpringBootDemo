package com.maven.ktServer.demo

import com.maven.ktServer.demo.bean.UploadFile
import com.maven.ktServer.demo.repository.FileRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    lateinit var fileRepository: FileRepository

    @Test
    fun contextLoads() {

		val file=UploadFile(oldFileName = "senssun.apk")
		fileRepository.save(file)
    }

}
