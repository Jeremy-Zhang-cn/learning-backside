package com.jeremy.tacocloud.taco.builder;

/**
 * @author Zhang Dingjie
 * @date 2020/11/26
 * @Description
 */
public class Product {

	private String partOne;
	private String partTwo;
	private String partThree;

	public Product() {
	}

	public Product(String partOne, String partTwo, String partThree) {
		this.partOne = partOne;
		this.partTwo = partTwo;
		this.partThree = partThree;
	}

	public String getPartOne() {
		return partOne;
	}

	public void setPartOne(String partOne) {
		this.partOne = partOne;
	}

	public String getPartTwo() {
		return partTwo;
	}

	public void setPartTwo(String partTwo) {
		this.partTwo = partTwo;
	}

	public String getPartThree() {
		return partThree;
	}

	public void setPartThree(String partThree) {
		this.partThree = partThree;
	}

	@Override
	public String toString() {
		return "Product{" +
				"partOne='" + partOne + '\'' +
				", partTwo='" + partTwo + '\'' +
				", partThree='" + partThree + '\'' +
				'}';
	}
}
