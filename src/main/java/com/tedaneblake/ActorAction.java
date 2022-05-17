package com.tedaneblake;

public class ActorAction {
	private Actor currActor = new Actor();
	
	private String fName;
	private String lName;
	private boolean isAdmin;
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	
	public String execute() {
		currActor.setFirstName(fName);
		currActor.setAdmin(isAdmin);
		currActor.setLastName(lName);
		boolean isAdmin = currActor.getIsAdmin();
		return isAdmin ? "admin" : "user";
	}


}
