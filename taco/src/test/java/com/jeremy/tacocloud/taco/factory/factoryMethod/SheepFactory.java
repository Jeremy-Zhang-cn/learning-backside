package com.jeremy.tacocloud.taco.factory.factoryMethod;

/**
 * @author Zhang Dingjie
 * @date 2020/11/26
 * @Description
 */
public class SheepFactory implements Factory {

	@Override
	public Animal produce() {
		return new Sheep();
	}
}
