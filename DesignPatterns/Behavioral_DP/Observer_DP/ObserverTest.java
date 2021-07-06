package DesignPatterns.Behavioral_DP.Observer_DP;

public class ObserverTest {

	public static void main(String[] args) {
		
		// Vishwa has to create a batch
		
		VishwaBatch batch = new VishwaBatch();
		
		// student should be created
		ObserverStudent student1 = new MyBatchSubscriber("Mohan");
		ObserverStudent student2 = new MyBatchSubscriber("Rahul");
		ObserverStudent student3 = new MyBatchSubscriber("Tina");
		ObserverStudent student4= new MyBatchSubscriber("Shiv");
		
		//Student should register to the course
		batch.register(student1);
		batch.register(student2);
		batch.register(student3);
		batch.register(student4);
		
		// Attaching the teacher
		student1.setVishwaSessions(batch);
		student2.setVishwaSessions(batch);
		student3.setVishwaSessions(batch);
		student4.setVishwaSessions(batch);
		
		batch.addStudyTopic("Observer Pattern");
	}
}
