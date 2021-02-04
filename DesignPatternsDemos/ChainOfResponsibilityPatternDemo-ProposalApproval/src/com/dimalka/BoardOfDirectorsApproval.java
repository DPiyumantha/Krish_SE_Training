package com.dimalka;

public class BoardOfDirectorsApproval extends Handler{
	@Override
	public void setRequiredApprovals(Proposal proposal) {
		proposal.setRequiredApprovals("BoD Approval");
		if(proposal.getImpactLevel()!=ImpactLevel.HIGH) {
			successor.setRequiredApprovals(proposal);
		}else {
			return;
		}
		
	}
}
