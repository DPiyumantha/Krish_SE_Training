package com.virtusa;

public class CEOApproval extends Handler{
	@Override
	public void setRequiredApprovals(Proposal proposal) {
		proposal.setRequiredApprovals("CEO Approval");
		if(proposal.getImpactLevel()!=ImpactLevel.MEDIUM_L2) {
			successor.setRequiredApprovals(proposal);
		}else {
			return;
		}
		
	}
}
