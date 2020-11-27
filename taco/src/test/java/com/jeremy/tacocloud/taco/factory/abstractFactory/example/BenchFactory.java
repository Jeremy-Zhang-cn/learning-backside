package com.jeremy.tacocloud.taco.factory.abstractFactory.example;

/**
 * @author Zhang Dingjie
 * @date 2020/11/27
 * @Description 具体工厂
 * 				同时具有生产同一系列产品（即同一品牌的轮胎与轮毂）的能力
 */
public class BenchFactory extends AbstractFactory {
	@Override
	public IProduct produceTyre() {
		return new BenchTyre();
	}

	@Override
	public IProduct produceHub() {
		return new BenchHub();
	}
}
