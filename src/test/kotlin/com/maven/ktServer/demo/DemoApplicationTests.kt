package com.maven.ktServer.demo

import com.maven.ktServer.demo.bean.UploadFile
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    lateinit var fileRepository: FileRepository

    @Test
    fun contextLoads() {

		val file=UploadFile(oldFileName = "senssun.apk",fileSize = "342",fileType = "xxx",savePath = "sss",saveName = "xxxxx",saveTime = "xxx",descs = "",id = 1L)
		fileRepository.save(file)
    }

}
