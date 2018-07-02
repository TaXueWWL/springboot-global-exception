package com.snowalker.service;

import com.snowalker.exception.GlobalException;
import com.snowalker.result.CodeMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author snowalker
 * @date 2018/7/3
 * @desc 测试service
 */
@Service
public class DemoService {

    public String execute(String username) {
        if (username == null) {
            throw new GlobalException(CodeMsg.SERVER_ERROR);
        }
        return UUID.randomUUID().toString();
    }
}
