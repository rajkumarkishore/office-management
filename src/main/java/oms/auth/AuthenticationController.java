package oms.auth;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthenticationController {

	private Logger log = LoggerFactory
			.getLogger(AuthenticationController.class);

	// load login view
	@RequestMapping(value = { "/", "/login" }, method = RequestMethod.GET)
	public String loginView() {
		log.debug("Login view loaded!");
		return "auth/login";
	}

	// login success
	@RequestMapping(value = { "/authenticated" }, method = RequestMethod.POST)
	public String loginSuccess(HttpServletRequest request) {
		log.debug("Login Success!");
		return "redirect:welcome";
	}

	// login error
	@RequestMapping(value = { "/bad-credentials" }, method = RequestMethod.GET)
	public String loginError(Model model) {
		log.debug("Login Failure!");
		model.addAttribute("error", true);
		return "auth/login";
	}

}
