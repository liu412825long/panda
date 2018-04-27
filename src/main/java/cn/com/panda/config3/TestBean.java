package cn.com.panda.config3;


public class TestBean {
	private String username;
	private String url;
	private String password;

	public void sayHello() {
		System.out.println("TestBean3 sayHello...");
	}

	public String toString() {
		return "username:" + this.username + ",url:" + this.url + ",password:" + this.password;
	}

	public void start() {
		System.out.println("TestBean3 初始化。。。");
	}

	public void cleanUp() {
		System.out.println("TestBean3 销毁。。。");
	}
}
