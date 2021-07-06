package DesignPatterns.Structural_DP.Facade;

public class HDFSReportGenerator {

	
	public void createConnection() {
		System.out.println("Creating the connection with HDFS");
	}
	
	public void generateTheCSVReport() {
		System.out.println("Generating the CSV report from HDFS");
	}
	
	public void generateThePDFReport() {
		System.out.println("Generating the PDF from HDFS");
	}
}
