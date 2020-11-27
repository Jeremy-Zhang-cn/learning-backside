package com.jeremy.tacocloud.taco.factory.factoryMethod.example;

/**
 * @author Zhang Dingjie
 * @date 2020/11/27
 * @Description 具体产品类
 */
public class BenchTyre implements TyreProducer {
	@Override
	public void show() {
		System.out.println("BenchTyre");
	}
}
