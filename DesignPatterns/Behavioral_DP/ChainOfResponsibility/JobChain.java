package DesignPatterns.Structural_DP.ChainOfResponsibility;

public interface JobChain {

	public void setNextChain(JobChain jobChain);
	
	public void getJob(Person person);
}
