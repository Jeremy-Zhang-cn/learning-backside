package com.jeremy.tacocloud.taco.proxy.impl;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Zhang Dingjie
 * @date 2020/11/25
 * @Description
 */
public class CglibInterceptor implements MethodInterceptor {

	private final Enhancer enhancer = new Enhancer();

	public Object newProxyInstance(Class<?> cls) {
		enhancer.setSuperclass(cls);
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

		System.out.println("~~~before enhance~~~");
		Object obj = methodProxy.invokeSuper(o, objects);
		System.out.println("~~~after enhance~~~");
		return obj;
	}

}
