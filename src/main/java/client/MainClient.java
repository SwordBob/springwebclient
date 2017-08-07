package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




/**
 * @author YuYang(zdsoft.yang@foxmail.com)
 *
 * @date 2014Äê5ÔÂ2ÈÕ
 */
public class MainClient {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-ws-servlet.xml");
		IUserService userService = (IUserService)ctx.getBean("userService");
		
		String loginInfo = userService.login("scott", "tiger");
		System.out.println(loginInfo);
		
		User user = userService.getUser("scott");
		
		System.out.println("---------User---------");
		System.out.println("username:" + user.getUsername());
		System.out.println("nickname:" + user.getNickname());
		System.out.println("password:" + user.getPassword());
	}
}
