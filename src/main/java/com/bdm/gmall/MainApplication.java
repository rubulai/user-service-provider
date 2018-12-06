package com.bdm.gmall;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String args[]) throws IOException {

		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
		ioc.start();
		System.in.read();// 这句代码是不让程序退出以便于我们在dubbo-admin中查看服务的情况
	}
}
