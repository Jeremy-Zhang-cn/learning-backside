package com.jeremy.tacocloud.taco.factory.abstractFactory.example;

/**
 * @author Zhang Dingjie
 * @date 2020/11/27
 * @Description 具体产品（轮毂）
 */
public class BenchHub implements IProduct {
	@Override
	public void show() {
		System.out.println("BenchHub");
	}
}
