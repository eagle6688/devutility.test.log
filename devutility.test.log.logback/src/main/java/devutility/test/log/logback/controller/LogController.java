package devutility.test.log.logback.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogController extends BaseController {
	@RequestMapping("/all")
	public String all(String message) {
		logger.trace(message);
		logger.debug(message);
		logger.info(message);
		logger.warn(message);
		logger.error(message);
		System.out.println(message);
		return message;
	}
}