package com.dimalka;

public class Approval extends Handler {

	@Override
	public void setRequiredApprovals(Proposal proposal) {
		successor.setRequiredApprovals(proposal);
		
	}
	
}
