package com.example.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lilufeng on 2016/8/25.
 */
@RestController
public class SysUserController {

    private final Logger logger = Logger.getLogger(getClass());

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public String add() {
        return "success";
    }
}
