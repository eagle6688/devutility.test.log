package devutility.test.log.log4j2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseController {
	protected static Logger logger = LoggerFactory.getLogger(BaseController.class);
}