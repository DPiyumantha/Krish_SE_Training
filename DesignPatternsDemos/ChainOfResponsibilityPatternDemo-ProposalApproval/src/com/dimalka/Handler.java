package com.dimalka;

public abstract class Handler {
	protected Handler successor;

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	public abstract void setRequiredApprovals(Proposal proposal);

}
