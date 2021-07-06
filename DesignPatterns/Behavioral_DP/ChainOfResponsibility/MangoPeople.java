package DesignPatterns.Behavioral_DP.ChainOfResponsibility;

public class MangoPeople {

	
	public static void main(String[] args) {
		
		FaangJob faangJob = new FaangJob();
		ProductJob productJob = new ProductJob();
		ServiceJob serviceJob = new ServiceJob();
		
		faangJob.setNextChain(productJob);
		productJob.setNextChain(serviceJob);
		
		
		Person person = new Person("PRODUCT");
		faangJob.getJob(person);
		
	}
}
