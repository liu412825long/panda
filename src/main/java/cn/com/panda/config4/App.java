package cn.com.panda.config4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *  @configuration嵌套（嵌套的Configuration必须是静态类）
       通过配置类嵌套的配置类，达到组合多个配置类的目的。但注意内部类必须是静态类。
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
    	 DataSource dataSource=context.getBean(DataSource.class);
    	 System.out.println(dataSource);
    }
}
