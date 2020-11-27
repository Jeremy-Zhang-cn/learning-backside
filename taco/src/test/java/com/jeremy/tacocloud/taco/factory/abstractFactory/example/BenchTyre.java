package com.jeremy.tacocloud.taco.factory.abstractFactory.example;

/**
 * @author Zhang Dingjie
 * @date 2020/11/27
 * @Description 具体产品（轮胎）
 */
public class BenchTyre implements IProduct {
	@Override
	public void show() {
		System.out.println("BenchTyre");
	}
}
