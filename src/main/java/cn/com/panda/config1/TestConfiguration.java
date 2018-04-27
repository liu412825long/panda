package cn.com.panda.config1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class TestConfiguration {
	
	public TestConfiguration() {
		System.out.println("TestConfiguration init");
	}
	
	@Bean(initMethod="start",destroyMethod="cleanUp")
	@Scope("prototype") //每次調用都生成一個新的對象
	public TestBean testBean() {
		return new TestBean();
	}

}
