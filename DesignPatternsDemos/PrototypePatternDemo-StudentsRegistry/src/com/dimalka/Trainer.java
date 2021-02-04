package com.dimalka;

public class Trainer extends Person{
	

	
	int totalTrainedBatches;

	public int getTotalTrainedBatches() {
		return totalTrainedBatches;
	}

	public void setTotalTrainedBatches(int totalTrainedBatches) {
		this.totalTrainedBatches = totalTrainedBatches;
	}

	@Override
	public String toString() {
		return "Trainer"+"[name=" + name + " , totalTrainedBatches =" + totalTrainedBatches+ "]";
	}

	

	

}
