package DesignPatterns.Behavioral_DP.ChainOfResponsibility;

public class Person {
	
	private String skillType;
	
	public Person(String skillType) {
		this.skillType = skillType;
	}
	
	public String getSkillType() {
		return this.skillType;
	}
	
}
