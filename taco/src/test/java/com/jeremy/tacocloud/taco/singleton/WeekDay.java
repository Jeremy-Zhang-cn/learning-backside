package com.jeremy.tacocloud.taco.singleton;

/**
 * @author Zhang Dingjie
 * @date 2020/11/26
 * @Description
 */
public enum WeekDay {
	MON(0, "MONDAY"),
	TUE(1, "TUESDAY"),
	WED(2, "WEDNESDAY"),
	THU(3, "THURSDAY"),
	FRI(4, "FRIDAY");


	private  int index;
	private String name;

	WeekDay() {
	}

	WeekDay(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "WeekDay{" +
				"index=" + index +
				", name='" + name + '\'' +
				'}';
	}
}
