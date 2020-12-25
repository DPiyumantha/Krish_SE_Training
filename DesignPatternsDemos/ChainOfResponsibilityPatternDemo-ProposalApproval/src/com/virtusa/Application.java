package com.virtusa;

public class Application {

	public static void main(String[] args) {
		Approval approval = new Approval();
		SupervisorApproval supervisorApproval = new SupervisorApproval();
		GeneralManagerApproval gmApproval = new GeneralManagerApproval();
		CEOApproval ceoApproval = new CEOApproval();
		BoardOfDirectorsApproval bodApproval = new BoardOfDirectorsApproval();
		VPApproval vpApproval = new VPApproval();
		
		approval.setSuccessor(supervisorApproval);
		supervisorApproval.setSuccessor(gmApproval);
		gmApproval.setSuccessor(ceoApproval);
		ceoApproval.setSuccessor(bodApproval);
		bodApproval.setSuccessor(vpApproval);
		
		Proposal proposal = new Proposal(10356, 1);
		approval.setRequiredApprovals(proposal);
		System.out.println(proposal);
		
		Proposal proposal_1 = new Proposal(5356, .3);
		approval.setRequiredApprovals(proposal_1);
		System.out.println(proposal_1);
		
		Proposal proposal_2 = new Proposal(54, 2.7);
		approval.setRequiredApprovals(proposal_2);
		System.out.println(proposal_2);
		
		Proposal proposal_3 = new Proposal(65, 9.23);
		approval.setRequiredApprovals(proposal_3);
		System.out.println(proposal_3);
		
		Proposal proposal_4 = new Proposal(10, 41);
		approval.setRequiredApprovals(proposal_4);
		System.out.println(proposal_4);
	}

}
