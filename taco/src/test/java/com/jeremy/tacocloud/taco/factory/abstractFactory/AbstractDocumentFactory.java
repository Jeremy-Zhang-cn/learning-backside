package com.jeremy.tacocloud.taco.factory.abstractFactory;

/**
 * @author Zhang Dingjie
 * @date 2020/11/27
 * @Description 抽象工厂模式
 *
 *  工厂中的每个方法都用于生产（返回）某一种具体的产品
 *  每个具体工厂都可以生产一系列不同的产品
 *  增加新的工厂只需要继承父类（实现接口）（符合开闭原则）
 *  增加新的产品需要在父类（接口）中添加新的产品生产方法（不符合开闭原则）
 *  e.g. 一个工厂有两条生产线分别用于代工生产一个品牌的轮胎与轮毂，
 *  	 想寻求新的代工工厂只需继承拥有生产轮胎与轮毂抽象方法的父类（接口），
 *  	 就可获得两条生产线生产不同于第一家共产品牌的产品
 *
 *  	 如果想在所有的代工厂中新增一条生产线用于生产刹车片
 *  	 则需要在父类（接口）工厂中声明新的用于生产刹车片的抽象方法
 *  	 并在所有子类即代工厂中重写（实现）新的方法
 *
 */
public abstract class AbstractDocumentFactory {

	public abstract DocumentHtml createHtml();

	public abstract DocumentPdf createPdf();

}
