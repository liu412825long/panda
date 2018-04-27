package cn.com.panda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cn.com.panda.config1.TestBean;
import cn.com.panda.config1.TestConfiguration;

/**
 * Hello world!
 * 注解学习的例子
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new AnnotationConfigApplicationContext(TestConfiguration.class);

    	 TestBean testBean=context.getBean(TestBean.class);
    	 testBean.sayHello();
    }
}
