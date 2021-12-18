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
			if((int)s.charAt(i) >= 65 && (int)s.charAt(i)<=90)
				check = 1;
			//System.out.println((int)s.charAt(i));
		}
		if(check == 1)
			return true;
		else
			return false;
	}
	
	public boolean specialCheck(String s)
	{
		int check = 0;
		for(int i=0; i<s.length(); i++)
		{
			if(((int)s.charAt(i) >= 33 && (int)s.charAt(i)<= 47) || ((int)s.charAt(i) >= 58 && (int)s.charAt(i)<= 64))
				check = 1;
			//System.out.println((int)s.charAt(i));
		}
		if(check == 1)
			return true;
		else
			return false;
	}
}
