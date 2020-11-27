package com.jeremy.tacocloud.taco.domain;

import lombok.Data;

import lombok.RequiredArgsConstructor;

/**
 * @author Zhang Dingjie
 * @date 2020/11/10
 * @Description
 */

@Data
@RequiredArgsConstructor
public class Ingredient {

	private final String id;
	private final String name;
	private final Type type;

	public enum Type {
		WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
	}


}
