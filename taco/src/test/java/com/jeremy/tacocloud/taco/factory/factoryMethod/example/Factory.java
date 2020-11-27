package com.jeremy.tacocloud.taco.factory.factoryMethod.example;

/**
 * @author Zhang Dingjie
 * @date 2020/11/27
 * @Description 抽象出共有生产方法的工厂类，作为所有具体工厂的父类
 */
public abstract class Factory {
	/**
	 *  抽象工厂方法
	 * @return
	 */
	public abstract TyreProducer produceTyre();
}
