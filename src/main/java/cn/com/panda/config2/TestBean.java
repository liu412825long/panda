package cn.com.panda.config2;

import org.springframework.stereotype.Component;

@Component
public class TestBean {
	private String username;
	private String url;
	private String password;

	public void sayHello() {
		System.out.println("TestBean2 sayHello...");
	}

	public String toString() {
		return "username:" + this.username + ",url:" + this.url + ",password:" + this.password;
	}

	public void start() {
		System.out.println("TestBean2 初始化。。。");
	}

	public void cleanUp() {
		System.out.println("TestBean2 销毁。。。");
	}
}
