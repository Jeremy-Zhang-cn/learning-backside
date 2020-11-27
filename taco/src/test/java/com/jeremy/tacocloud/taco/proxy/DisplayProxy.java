package com.jeremy.tacocloud.taco.proxy;

import com.jeremy.tacocloud.taco.proxy.impl.BaseDisplay;

/**
 * @author Zhang Dingjie
 * @date 2020/11/25
 * @Description
 */
public class DisplayProxy implements IDisplay {

	private BaseDisplay target;

	public DisplayProxy() {

	}

	public DisplayProxy(BaseDisplay baseDisplay) {
		if (baseDisplay != null) this.target = baseDisplay;
	}

	@Override
	public void display() {
		System.out.println("---before proxy---");
		target.display();
		System.out.println("---after proxy---");
	}

}
