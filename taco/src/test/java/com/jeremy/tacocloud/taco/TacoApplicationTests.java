package com.jeremy.tacocloud.taco;

import com.jeremy.tacocloud.taco.builder.AbstractBuilder;
import com.jeremy.tacocloud.taco.builder.Product;
import com.jeremy.tacocloud.taco.builder.ProductBuilder;
import com.jeremy.tacocloud.taco.factory.abstractFactory.BrutalDocumentFactory;
import com.jeremy.tacocloud.taco.factory.abstractFactory.FastDocumentFactory;
import com.jeremy.tacocloud.taco.factory.factoryMethod.CattleFactory;
import com.jeremy.tacocloud.taco.factory.factoryMethod.SheepFactory;
import com.jeremy.tacocloud.taco.proxy.CglibDisplay;
import com.jeremy.tacocloud.taco.proxy.DisplayProxy;
import com.jeremy.tacocloud.taco.proxy.IDisplay;
import com.jeremy.tacocloud.taco.proxy.impl.JavaProxyInvocationHandler;
import com.jeremy.tacocloud.taco.proxy.impl.BaseDisplay;
import com.jeremy.tacocloud.taco.proxy.impl.CglibInterceptor;
import com.jeremy.tacocloud.taco.singleton.SingletonHolder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.*;

@SpringBootTest
class TacoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void staticProxyTest() {
		DisplayProxy proxy = new DisplayProxy(new BaseDisplay());
		proxy.display();
	}

	@Test
	public void javaProxyTest() {
		JavaProxyInvocationHandler handler = new JavaProxyInvocationHandler(new BaseDisplay());
		IDisplay display = (IDisplay) handler.newProxyInstance();
		display.display();

	}

	@Test
	public void cglibProxyTest() {
		CglibInterceptor cglibProxy = new CglibInterceptor();
		CglibDisplay cglibDisplay = (CglibDisplay) cglibProxy.newProxyInstance(CglibDisplay.class);
		cglibDisplay.display();
	}

	@Test
	public void builderTest() {
		AbstractBuilder builder = new ProductBuilder();
		Product product = builder.buildPartOne("aa")
				.buildPartTwo("bb")
				.buildPartThree("cc")
				.build();
		System.out.println(product);
	}

	@Test
	public void singletonTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		SingletonHolder instance = SingletonHolder.INSTANCE;
		// 暴力反射失败
//		Constructor<SingletonHolder> constructor = SingletonHolder.class.getDeclaredConstructor(String.class, int.class);
//		constructor.setAccessible(true);
//		SingletonHolder singletonHolder = constructor.newInstance();
		SingletonHolder holder = SingletonHolder.INSTANCE;
		holder.display();

	}

	@Test
	public void factoryMethodTest() {
		new CattleFactory().produce().display();
		new SheepFactory().produce().display();
	}

	@Test
	public void abstractFactoryTest() {
		new FastDocumentFactory().createHtml().transfer2Html();
		new BrutalDocumentFactory().createHtml().transfer2Html();
		new FastDocumentFactory().createPdf().transfer2Pdf();
		new BrutalDocumentFactory().createPdf().transfer2Pdf();
	}

}
