package com.jeremy.tacocloud.taco.builder;

/**
 * @author Zhang Dingjie
 * @date 2020/11/26
 * @Description
 */
public abstract class AbstractBuilder {

	public abstract AbstractBuilder buildPartOne(String partOne);
	public abstract AbstractBuilder buildPartTwo(String partTwo);
	public abstract AbstractBuilder buildPartThree(String partThree);
	public abstract Product build();

}
