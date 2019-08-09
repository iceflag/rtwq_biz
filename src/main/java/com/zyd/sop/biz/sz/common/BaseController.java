package com.zyd.sop.biz.sz.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class BaseController {

    private static final Logger logger = LoggerFactory.getLogger(BaseController.class);

    @ExceptionHandler(value = Exception.class)
    public Object globalExceptionHandle(Exception e) {
        logger.error("发生异常:", e);
        throw new ServiceException("非常抱歉,服务异常,请稍后再试");
    }

}
