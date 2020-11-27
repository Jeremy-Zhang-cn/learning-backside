package com.jeremy.tacocloud.taco.factory.abstractFactory.example;

/**
 * @author Zhang Dingjie
 * @date 2020/11/27
 * @Description 具体工厂
 */
public class CouchFactory extends AbstractFactory {
	@Override
	public IProduct produceTyre() {
		return new CouchTyre();
	}

	@Override
	public IProduct produceHub() {
		return new CouchHub();
	}
}
