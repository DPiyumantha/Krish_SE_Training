package com.dimalka;

public class SupervisorApproval extends Handler{

	@Override
	public void setRequiredApprovals(Proposal proposal) {
		proposal.setRequiredApprovals("Supervisor Approval");
		if(proposal.getImpactLevel()!=ImpactLevel.MINOR) {
			successor.setRequiredApprovals(proposal);
		}else {
			return;
		}
		
	}

}
