package devutility.test.log.logback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseController {
	protected static Logger logger = LoggerFactory.getLogger(BaseController.class);

	protected Logger getLogger() {
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		StackTraceElement stackTraceElement = stackTraceElements[1];
		return LoggerFactory.getLogger(stackTraceElement.getClassName());
	}
}