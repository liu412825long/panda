package cn.com.panda.config2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("cn.com.panda.config2")
public class TestConfiguration {
	
	public TestConfiguration() {
		System.out.println("TestConfiguration init");
	}

}
