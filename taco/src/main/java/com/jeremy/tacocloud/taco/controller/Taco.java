package com.jeremy.tacocloud.taco.controller;

import com.jeremy.tacocloud.taco.domain.Ingredient;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @author Zhang Dingjie
 * @date 2020/11/24
 * @Description
 */
@Data
@RequiredArgsConstructor
public class Taco {

	private String id;
	private String name;
	private Ingredient ingredient;

}
