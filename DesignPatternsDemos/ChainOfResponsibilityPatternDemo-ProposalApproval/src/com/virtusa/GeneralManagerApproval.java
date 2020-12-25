package com.virtusa;

public class GeneralManagerApproval extends Handler {
	@Override
	public void setRequiredApprovals(Proposal proposal) {
		proposal.setRequiredApprovals("General Manager Approval");
		if(proposal.getImpactLevel()!=ImpactLevel.MEDIUM_L1) {
			successor.setRequiredApprovals(proposal);
		}else {
			return;
		}
		
	}
}
