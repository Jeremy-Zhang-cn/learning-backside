package com.jeremy.tacocloud.taco.proxy.impl;

import com.jeremy.tacocloud.taco.proxy.IDisplay;

/**
 * @author Zhang Dingjie
 * @date 2020/11/25
 * @Description
 */
public class BaseDisplay implements IDisplay {


	@Override
	public void display() {
		System.out.println("~~~base display()~~~");
	}


}
