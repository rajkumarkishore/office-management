package oms.auth;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthenticationController {

	private Logger log = LoggerFactory
			.getLogger(AuthenticationController.class);

	@RequestMapping(value = { "/", "/login" }, method = RequestMethod.GET)
	public String initialView() {
		log.debug("*********** DEBUG ************");
		log.info("*********** INFO ************");
		log.warn("*********** WARN ************");
		log.error("*********** ERROR ************");
		return "auth/login";
	}

	@RequestMapping(value = { "/login" }, method = RequestMethod.POST)
	public String authenticate(HttpServletRequest request) {
		log.debug(request.getParameter("username") + ""
				+ request.getParameter("password"));
		return "auth/login";
	}

}
