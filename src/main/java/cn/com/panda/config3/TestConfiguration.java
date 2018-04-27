package cn.com.panda.config3;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:applicationContext.xml")
public class TestConfiguration {
	
	public TestConfiguration() {
		System.out.println("TestConfiguration init");
	}
	

}
