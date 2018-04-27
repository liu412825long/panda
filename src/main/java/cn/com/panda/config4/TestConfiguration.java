package cn.com.panda.config4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("cn.com.panda.config4")
public class TestConfiguration {
	
	public TestConfiguration() {
		System.out.println("TestConfiguration init");
	}
	
	@Configuration
	class DataSourceConfig{
		@Bean
		public DataSource dataSource() {
			return new DataSource();
		}
	}
	

}
