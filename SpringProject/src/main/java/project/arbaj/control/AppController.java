package project.arbaj.control;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AppController {
	@RequestMapping(path = "/test", method = RequestMethod.GET)
	public String test() {
		return "test";
	}

	@RequestMapping(path = "/update", method = RequestMethod.POST)
	public String update(@RequestBody Password pw) {
		String status = "";
		String password = "ali";
		String check = pw.getNewpassword();
		PasswordAuth auth = new PasswordAuth();
		if (pw.getOldpassword().equalsIgnoreCase(password)) {
			if(auth.companyCheck(check))
			{
				status = "password changed";
				if(auth.lengthCheck(check))
				{
					status = "password changed";
					if(auth.capsCheck(check))
					{
						status = "password changed";
					}
					else
					{
						status = "your password must include a capital letter";
					}
				}
				else
				{
					status = "use a longer password";
				}
			}
			else
			{
				status = "do not use company name";
			}
			/*if (pw.getNewpassword().equalsIgnoreCase("cognizant")) {
				status = "do not use company name";
				System.out.println("false");
			} else {
				password = pw.getNewpassword();
				status = "password changed";
				System.out.println("correct");
			}
			*/
			System.out.println("new password = " + password);
		}
		else
		{
			status = "incorrect password";
		}
		return status;
	}

	@RequestMapping(path = "/actuator/info", method = RequestMethod.GET)
	public String info() {
		return "running";
	}
}
