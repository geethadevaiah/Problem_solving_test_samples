package DesignPatterns.Structural_DP.Observer_DP;

public class MyBatchSubscriber implements ObserverStudent{

	private String name;
	private VishwaSession vishwaSession;
	
	public MyBatchSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		String sessionPlan = vishwaSession.getUpdate(this);
		System.out.println("Fetched the session plan = "+sessionPlan);
	}

	@Override
	public void setVishwaSessions(VishwaSession session) {
		this.vishwaSession = session;
	}

	@Override
	public String getName() {
		return this.name;
	}

}
