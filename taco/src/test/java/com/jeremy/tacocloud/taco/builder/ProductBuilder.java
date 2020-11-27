package com.jeremy.tacocloud.taco.builder;

/**
 * @author Zhang Dingjie
 * @date 2020/11/26
 * @Description
 */
public class ProductBuilder extends AbstractBuilder {

	private final Product product = new Product();

	@Override
	public AbstractBuilder buildPartOne(String partOne) {
		product.setPartOne(partOne);
		return this;
	}

	@Override
	public AbstractBuilder buildPartTwo(String partTwo) {
		product.setPartTwo(partTwo);
		return this;
	}

	@Override
	public AbstractBuilder buildPartThree(String partThree) {
		product.setPartThree(partThree);
		return this;
	}

	public Product build() {
		return this.product;
	}

}
