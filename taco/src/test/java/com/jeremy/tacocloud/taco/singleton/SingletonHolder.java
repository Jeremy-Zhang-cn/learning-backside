package com.jeremy.tacocloud.taco.singleton;

import com.jeremy.tacocloud.taco.proxy.IDisplay;

/**
 * @author Zhang Dingjie
 * @date 2020/11/26
 * @Description
 */
public enum SingletonHolder implements IDisplay {
	INSTANCE {
		@Override
		public void display() {
			System.out.println("singleton of enum...");
		}
	}
}
