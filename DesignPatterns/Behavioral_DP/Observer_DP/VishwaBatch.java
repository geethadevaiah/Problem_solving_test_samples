package DesignPatterns.Behavioral_DP.Observer_DP;

import java.util.ArrayList;
import java.util.List;

public class VishwaBatch implements VishwaSession {

	private List<ObserverStudent> registeredStudents ; 

	private String studyTopic;
	
	public VishwaBatch() {
		// in the beginning there will be no students
		this.registeredStudents = new ArrayList<>();
	}
	
	@Override
	public void register(ObserverStudent observerStudent) {
		System.out.println("Registering student = "+ observerStudent.getName());
		registeredStudents.add(observerStudent);
	}

	@Override
	public void unregister(ObserverStudent observerStudent) {
		System.out.println("Unregistering the student = "+observerStudent.getName());
	}

	@Override
	public void notifyObservingStudents() {
		// notify all the registered student with a new class
		for(ObserverStudent student : this.registeredStudents) {
			student.update();
		}
	}

	/**
	 * Student is making the call to know the session details
	 */
	@Override
	public String getUpdate(ObserverStudent observerStudent) {
		
		// check if the student is registered
		if(registeredStudents.contains(observerStudent)) {
			return this.studyTopic;
		}
		return null;
	}

	
	// method to update the topics of discussion every session
	
	public void addStudyTopic(String studyTopic) {
		System.out.println("Added the study topic = "+ studyTopic);
		this.studyTopic = studyTopic;
		// notify all the users
		notifyObservingStudents();
	}
}
