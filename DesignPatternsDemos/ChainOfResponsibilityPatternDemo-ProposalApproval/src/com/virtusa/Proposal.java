package com.virtusa;

import java.util.ArrayList;

public class Proposal {
	private int proposalNumber;
	private ImpactLevel impactLevel;
	private double proposalBudgetInMillions;
	private ArrayList<String> requiredApprovals = new ArrayList<>();;
	
	public Proposal(int proposalNumber, double proposalBudget) {
		this.proposalBudgetInMillions=proposalBudget;
		this.proposalNumber = proposalNumber;
		setImpactLevel(proposalBudget);
	}
	
	private void setImpactLevel(double proposalBudget) {
		if(proposalBudget<0.5) {
			this.impactLevel=ImpactLevel.MINOR;
		}else if(proposalBudget<2) {
			this.impactLevel=ImpactLevel.MEDIUM_L1;
		}else if(proposalBudget<5) {
			this.impactLevel=ImpactLevel.MEDIUM_L2;
		}else if(proposalBudget<10) {
			this.impactLevel=ImpactLevel.HIGH;
		}else {
			this.impactLevel=ImpactLevel.SEVERE;
		}
	}
	
	public void setRequiredApprovals(String approval) {
		requiredApprovals.add(approval);
	}

	@Override
	public String toString() {
		return "Proposal [proposalNumber=" + proposalNumber + ", impactLevel=" + impactLevel
				+ ", proposalBudgetInMillions=" + proposalBudgetInMillions + ", requiredApprovals=" + requiredApprovals
				+ "]";
	}

	public ImpactLevel getImpactLevel() {
		return impactLevel;
	}
	
	

}
