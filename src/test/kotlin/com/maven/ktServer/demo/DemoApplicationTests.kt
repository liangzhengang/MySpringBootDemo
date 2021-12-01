package com.maven.ktServer.demo

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoApplicationTests {

	@Test
	fun contextLoads() {
		var add = fun(): () -> Int {
			var counter = 0
			return  {
				counter += 1
				counter
			}
		}
		add()
		add()
		add()

	}

}
