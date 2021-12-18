package project.arbaj.control;

public class PasswordAuth {
	public boolean companyCheck(String s)
	{
		if(s.equalsIgnoreCase("cognizant"))
			return false;
		else
			return true;
	}
	
	public boolean lengthCheck(String s)
	{
		if(s.length()<6)
			return false;
		else
			return true;
	}
	
	public boolean capsCheck(String s)
	{
		int check = 0;
		for(int i=0; i<s.length(); i++)
		{
			if((int)s.charAt(i) >= 65 || (int)s.charAt(i)<=90)
				check = 1;
		}
		if(check == 1)
			return true;
		else
			return false;
	}
}
