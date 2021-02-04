package com.dimalka;

public class Application {

	public static void main(String[] args) {
		/*
		 * In a certain company when a new project is proposed
		 * proposals are categorised into five impact levels
		 * according to the budget.
		 * According to the impact level, this proposal should have the 
		 * approvals from various positions.
		 * Minimum impact level proposals(MINOR) only need approval
		 * from the supervisor and maximum impact level proposal(SEVERE) need 
		 * approval from supervisor, general manager, CEO, board of directors and VP
		 *
		 * */
		 
		Approval approval = new Approval();
		SupervisorApproval supervisorApproval = new SupervisorApproval();
		GeneralManagerApproval gmApproval = new GeneralManagerApproval();
		CEOApproval ceoApproval = new CEOApproval();
		BoardOfDirectorsApproval bodApproval = new BoardOfDirectorsApproval();
		VPApproval vpApproval = new VPApproval();
		
		//Chain of approvals
		approval.setSuccessor(supervisorApproval);
		supervisorApproval.setSuccessor(gmApproval);
		gmApproval.setSuccessor(ceoApproval);
		ceoApproval.setSuccessor(bodApproval);
		bodApproval.setSuccessor(vpApproval);
		
		//Impact Level will be set according to the budget value
		
		//MEDIUM_L1 impact
		Proposal proposal = new Proposal(10356, 1);
		approval.setRequiredApprovals(proposal);
		System.out.println(proposal);
		//MINOR impact
		Proposal proposal_1 = new Proposal(5356, .3);
		approval.setRequiredApprovals(proposal_1);
		System.out.println(proposal_1);
		//MEDIUM_L2 impact
		Proposal proposal_2 = new Proposal(54, 2.7);
		approval.setRequiredApprovals(proposal_2);
		System.out.println(proposal_2);
		//HIGH impact
		Proposal proposal_3 = new Proposal(65, 9.23);
		approval.setRequiredApprovals(proposal_3);
		System.out.println(proposal_3);
		//SEVERE impact
		Proposal proposal_4 = new Proposal(10, 41);
		approval.setRequiredApprovals(proposal_4);
		System.out.println(proposal_4);
	}

}
