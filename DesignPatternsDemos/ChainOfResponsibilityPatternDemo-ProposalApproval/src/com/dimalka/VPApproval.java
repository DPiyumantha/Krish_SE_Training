package com.dimalka;

public class VPApproval extends Handler{
	@Override
	public void setRequiredApprovals(Proposal proposal) {
		proposal.setRequiredApprovals("VP Approval");
//		if(proposal.getImpactLevel()!=ImpactLevel.SEVERE) {
//			successor.setRequiredApprovals(proposal);
//		}else {
//			return;
//		}
		
	}
}
