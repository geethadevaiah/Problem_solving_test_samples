package DesignPatterns.Behavioral_DP.Observer_DP;

public interface VishwaSession {

	// method to allow student registration
	public void register(ObserverStudent observerStudent);
	
	// method to unregister
	public void unregister(ObserverStudent observerStudent);
	
	// notify students
	public void notifyObservingStudents();
	
	// student wants to know the update
	public String getUpdate(ObserverStudent observerStudent);
}
