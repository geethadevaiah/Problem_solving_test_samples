package DesignPatterns.Structural_DP.ChainOfResponsibility;

public class ProductJob implements JobChain{

private JobChain jobchain;
	
	@Override
	public void setNextChain(JobChain jobChain) {
		this.jobchain = jobChain;
	}

	@Override
	public void getJob(Person person) {
		if(person.getSkillType().equals("PRODUCT")) {
			System.out.println("Got selected in PRODUCT company");
		}
		else {
			System.out.println("Got rejected in Product company.");
			System.out.println("Please try for Service companies");
			this.jobchain.getJob(person);
		}
	}

	
}
