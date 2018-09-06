package devutility.test.log.log4j2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log4j2")
public class Log4j2Controller extends BaseController {
	@RequestMapping("/all")
	public String all(String message) {
		trace(message);
		debug(message);
		info(message);
		warn(message);
		error(message);
		return message;
	}

	@RequestMapping("/trace")
	public String trace(String message) {
		System.out.println(message);
		logger.trace(message);
		return message;
	}

	@RequestMapping("/debug")
	public String debug(String message) {
		System.out.println(message);
		logger.debug(message);
		return message;
	}

	@RequestMapping("/info")
	public String info(String message) {
		System.out.println(message);
		logger.info(message);
		return message;
	}

	@RequestMapping("/warn")
	public String warn(String message) {
		System.out.println(message);
		logger.warn(message);
		return message;
	}

	@RequestMapping("/error")
	public String error(String message) {
		System.out.println(message);
		logger.error(message);
		return message;
	}
}