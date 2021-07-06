package DesignPatterns.Structural_DP.Facade;

public class ReportFacade {

	public void generateReport(String dataSourceType, String reportType) {
		if(dataSourceType.equals("HDFS")) {
			HDFSReportGenerator hdfs = new HDFSReportGenerator();
			hdfs.createConnection();
			if(reportType.equals("PDF")) 
				hdfs.generateThePDFReport();
			else 
				hdfs.generateTheCSVReport();
		}
		else if(dataSourceType.equals("MONGO")){
			MongoDBReportGenerator mongoDBReportGenerator = new MongoDBReportGenerator();
			mongoDBReportGenerator.createConnection();
			if(reportType.equals("PDF"))
				mongoDBReportGenerator.generateThePDFReport();
			else
				mongoDBReportGenerator.generateTheCSVReport();
		}
	}
}
