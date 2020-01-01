package com.zyccx.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2019/9/30 10:29
 * @Created by Zhangyichao
 */
@ComponentScan("com.zyccx.demo")
public class Test {
	public static void main(String[] args) {
//		System.out.println("com.zyccx.demo");
//		IndexDao indexDao=new IndexDao();
//		indexDao.say();
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				=new AnnotationConfigApplicationContext();
	annotationConfigApplicationContext.register(IndexDao.class);
	annotationConfigApplicationContext.refresh();

		System.out.println(annotationConfigApplicationContext.getBean(IndexDao.class));
		IndexDao indexDao=annotationConfigApplicationContext.getBean(IndexDao.class);
		System.out.println(indexDao);

		indexDao.say();
		// System.out.println(annotationConfigApplicationContext.getBean(TestService.class));

	}
}
