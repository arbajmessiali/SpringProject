package project.arbaj.control;

import org.springframework.web.bind.annotation.RequestBody;
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
	public String update(@RequestBody Password pw)
	{
		String status="";
		String password = "ali";
		if(pw.getOldpassword().equalsIgnoreCase(password))
		{
			password = pw.getNewpassword();
			status = "password changed";
			System.out.println("correct");
		}
		else
		{
			status = "password not correct";
			System.out.println("false");
		}
		return status;
	}
}
