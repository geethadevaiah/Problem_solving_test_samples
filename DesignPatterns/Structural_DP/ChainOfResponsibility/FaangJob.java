package DesignPatterns.Structural_DP.ChainOfResponsibility;

public class FaangJob implements JobChain {

	private JobChain jobchain;
	
	@Override
	public void setNextChain(JobChain jobChain) {
		this.jobchain = jobChain;
	}

	@Override
	public void getJob(Person person) {
		if(person.getSkillType().equals("FAANG")) {
			System.out.println("Got selected in FAANG");
		}
		else {
			System.out.println("Got rejected in FAANG.");
			System.out.println("Please try for Product companies");
			this.jobchain.getJob(person);
		}
	}

}
