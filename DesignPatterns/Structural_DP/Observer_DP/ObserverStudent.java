package DesignPatterns.Structural_DP.Observer_DP;

public interface ObserverStudent {
	
	// used to update the student
	public void update();
	
	// make this student aware that he has to take session
	public void setVishwaSessions(VishwaSession session);
	
	// get the name of the student
	public String getName();
}
