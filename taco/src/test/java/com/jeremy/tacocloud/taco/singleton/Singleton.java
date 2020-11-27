package com.jeremy.tacocloud.taco.singleton;

/**
 * @author Zhang Dingjie
 * @date 2020/11/26
 * @Description
 */
public class Singleton {


	/*

	// 饿汉式
	private static final Singleton instance = new Singleton();

	public static Singleton getInstance() {
		return instance;
	}

	// 方法锁
	private static  Singleton instance = null;

	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	// 双重锁检测
	private static volatile Singleton instance = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	*/

	private Singleton() {
	}

	// 静态内部类, 利用classLoader实现懒加载
	// 只有在调用getInstance()方法时内部类SingletonHolder才会被加载
	private static class SingletonHolder {
		private static final Singleton instance = new Singleton();
	}

	public static Singleton getInstance() {
		return SingletonHolder.instance;
	}

}
