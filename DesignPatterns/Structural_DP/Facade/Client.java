package DesignPatterns.Structural_DP.Facade;

public class Client {
	
	public static void main(String[] args) {
		ReportFacade reportFacade = new ReportFacade();
		reportFacade.generateReport("HDFS", "PDF");
	}
	
	/**
	 * Hiding the layers below complex operations
	 * 
	 * only facade layer is used for major functionalities
	 * 
	 * only generateReport in necessary.
	 * 
	 */
}
