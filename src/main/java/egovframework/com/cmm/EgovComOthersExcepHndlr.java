package egovframework.com.cmm;

import egovframework.rte.fdl.cmmn.exception.handler.ExceptionHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EgovComOthersExcepHndlr implements ExceptionHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(EgovComOthersExcepHndlr.class);

    public void occur(Exception exception, String packageName) {
    	//log.debug(" EgovServiceExceptionHandler run...............");
    	LOGGER.error(packageName, exception);
    	LOGGER.error(exception.getMessage(), exception);
    	LOGGER.debug("장애 발생원인을 메일발송을 하였습니다.");
    }
}
