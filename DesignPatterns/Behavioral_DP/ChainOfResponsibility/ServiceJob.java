package DesignPatterns.Behavioral_DP.ChainOfResponsibility;

public class ServiceJob implements JobChain{
	
	
	@Override
	public void setNextChain(JobChain jobChain) {
	}

	@Override
	public void getJob(Person person) {
		if(person.getSkillType().equals("SERVICE")) {
			System.out.println("Got selected in Service company");
		}
		else {
			System.out.println("Got rejected in Service company.");
			System.out.println("Please study hard and come back!");
		}
	}

}
