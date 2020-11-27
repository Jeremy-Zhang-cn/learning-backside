package com.jeremy.tacocloud.taco.factory.factoryMethod;

/**
 * @author Zhang Dingjie
 * @date 2020/11/26
 * @Description 工厂方法模式
 *  只可以生产同一类的产品
 * 	需要新的工厂只需实现工厂接口覆写产品生产方法即可（符合开闭原则）
 * 	工厂抽象类中抽象出生产方法，返回产品的父类
 */
public interface Factory {
	Animal produce();
}
