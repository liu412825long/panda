package cn.com.panda.config3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *  在@configuration中引入spring的xml配置文件
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
