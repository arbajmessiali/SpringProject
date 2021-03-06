package project.arbaj.control;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/UserManagement")
public class AppController {
	
	@RequestMapping(path = "/ChangePassword", method = RequestMethod.POST)
	public String update(@RequestBody Password pw) {
		String status = "";
		String password = "Arbaj@1234";
		String check = pw.getNewpassword();
		PasswordAuth auth = new PasswordAuth();
		if (pw.getOldpassword().equals(password)) {
			if(auth.companyCheck(check))
			{
				status = "password changed";
				if(auth.lengthCheck(check))
				{
					status = "password changed";
					if(auth.capsCheck(check))
					{
						status = "password changed";
						if(auth.specialCheck(check))
						{
							status = "password changed" + "\n";
							password = check;
							status = status + "new password = " + password;
						}
						else
							status = "your password must include a special character";
					}
					else
						status = "your password must include a capital letter";
				}
				else
					status = "use a longer password";
			}
			else
				status = "do not use company name";
		}
		else
			status = "incorrect password";
		return status;
	}

	@RequestMapping(path = "/actuator/info", method = RequestMethod.GET)
	public String info() {
		return "running";
	}
}
