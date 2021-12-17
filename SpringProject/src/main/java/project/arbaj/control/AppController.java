package project.arbaj.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/control")
public class AppController 
{
	@RequestMapping(path = "/test", method = RequestMethod.GET)
	public String test()
	{
		return "test";
	}
	
	@RequestMapping(path = "/update" , method = RequestMethod.POST)
	public String update(Password pw)
	{
		String status="";
		User u = new User("arbaj", "ali");
		if(pw.oldpassword == u.getPassword())
		{
			u.setPassword(pw.newpassword);
			status = "password changed";
		}
		else
			status = "password not correct";
		return status;
	}
}
