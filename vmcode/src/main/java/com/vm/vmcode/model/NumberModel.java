package com.vm.vmcode.model;

import java.io.Serializable;

public class NumberModel implements Serializable {
	private int goal;
	private int step;

	public NumberModel(int goal, int step) {
		this.goal = goal;
		this.step = step;
	}

	public int getGoal() {
		return goal;
	}

	public void setGoal(int goal) {
		this.goal = goal;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

}
