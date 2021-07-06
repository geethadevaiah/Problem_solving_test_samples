package DesignPatterns.Structural_DP.Facade;

public class MongoDBReportGenerator {
	
	public void createConnection() {
		System.out.println("Creating the connection with MongoDB");
	}
	
	public void generateTheCSVReport() {
		System.out.println("Generating the CSV report from MongoDB");
	}
	
	public void generateThePDFReport() {
		System.out.println("Generating the PDF from MongoDB");
	}
}
