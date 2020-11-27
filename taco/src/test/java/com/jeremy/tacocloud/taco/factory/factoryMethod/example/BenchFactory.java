package com.jeremy.tacocloud.taco.factory.factoryMethod.example;

/**
 * @author Zhang Dingjie
 * @date 2020/11/27
 * @Description 具体工厂，生产具体产品
 */
public class BenchFactory extends Factory {

	/**
	 *  具体工厂方法，覆写自父类
	 * @return
	 */
	@Override
	public TyreProducer produceTyre() {
		return new BenchTyre();
	}
}
