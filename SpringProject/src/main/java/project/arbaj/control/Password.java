package project.arbaj.control;

public class Password {
	public String oldpassword;
	public String newpassword;
	
	public String getOldpassword() {
		return oldpassword;
	}
	public void setOldpassword(String oldpassword) {
		this.oldpassword = oldpassword;
	}
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	
	public Password(String oldpassword, String newpassword)
	{
		this.oldpassword = oldpassword;
		this.newpassword = newpassword;
	}
}
