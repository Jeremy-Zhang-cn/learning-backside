package com.jeremy.tacocloud.taco.proxy.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Zhang Dingjie
 * @date 2020/11/25
 * @Description
 */
public class JavaProxyInvocationHandler implements InvocationHandler {

	private Object target;

	public JavaProxyInvocationHandler() {
	}

	public JavaProxyInvocationHandler(Object target) {
		this.target = target;
	}

	public Object newProxyInstance () {
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(),
				target.getClass().getInterfaces(),
				this
		);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("---before proxy---");
		Object result = method.invoke(target, args);
		System.out.println("---after proxy---");
		return result;
	}

}
