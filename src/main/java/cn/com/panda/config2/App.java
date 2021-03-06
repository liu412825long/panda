package cn.com.panda.config2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *@Configuration启动容器+@Bean注册Bean，@Bean下管理bean的生命周期
 */
public class App 
{
    public static void main( String[] args )
    {
    	 // @Configuration注解的spring容器加载方式，用AnnotationConfigApplicationContext替换ClassPathXmlApplicationContext
    	 ApplicationContext context = new AnnotationConfigApplicationContext(TestConfiguration.class);

    	  // 如果加载spring-context.xml文件：
         // ApplicationContext context = new
         // ClassPathXmlApplicationContext("spring-context.xml");
    	 TestBean testBean=context.getBean(TestBean.class);
    	 testBean.sayHello();
    }
}
