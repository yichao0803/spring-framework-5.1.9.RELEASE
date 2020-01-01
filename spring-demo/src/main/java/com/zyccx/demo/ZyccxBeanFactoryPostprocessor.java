package com.zyccx.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/** ZyccxBeanFactoryPostprocessor
 * @Classname ZyccxBeanFactoryPostprocessor
 * @Description TODO
 * @Date 2019/10/5 10:42
 * @Created by Zhangyichao
 */

@Component
public class ZyccxBeanFactoryPostprocessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//		GenericBeanDefinition i =(GenericBeanDefinition)beanFactory.getBeanDefinition("i");
//		System.out.println(i.getBeanClassName());
//		i.setBeanClass(TestService.class);
//		System.out.println(i.getBeanClassName());
	}
}
