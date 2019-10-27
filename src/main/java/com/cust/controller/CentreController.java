package com.cust.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author Wangbo
 * @Date 2019/10/27
 * @Version V1.0
 **/

@Controller
public class CentreController {

    @RequestMapping("/success")
    public String toSuccess() {
        return "success";
    }
}
