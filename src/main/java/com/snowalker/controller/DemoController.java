package com.snowalker.controller;

import com.snowalker.exception.GlobalException;
import com.snowalker.result.CodeMsg;
import com.snowalker.result.Result;
import com.snowalker.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author snowalker
 * @date 2018/7/3
 * @desc 全局异常处理测试controller
 */
@Controller
@RequestMapping(value = "demo")
public class DemoController {

    @Autowired
    DemoService service;

    @RequestMapping(value = "test", method = {RequestMethod.GET, RequestMethod.POST})
    public @ResponseBody Result test(@RequestParam(value = "username", required = true) String username) {
        String userId = service.execute(username);
        return Result.success(userId);
    }
}
