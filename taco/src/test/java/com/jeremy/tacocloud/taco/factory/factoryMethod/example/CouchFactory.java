package com.jeremy.tacocloud.taco.factory.factoryMethod.example;

/**
 * @author Zhang Dingjie
 * @date 2020/11/27
 * @Description 具体工厂类 生产具体产品
 */
public class CouchFactory extends Factory {
	@Override
	public TyreProducer produceTyre() {
		return new CouchTyre();
	}
}
