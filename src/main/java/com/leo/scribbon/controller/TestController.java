package com.leo.scribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.leo.scribbon.RestResponse;
import com.leo.scribbon.service.RibbonService;

/**
 * Created by leo on 2018/1/18.
 * Description:
 */
@RestController
public class TestController {
    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/test")
    public RestResponse test() {
        return new RestResponse<>(ribbonService.requestEurekaClient());
    }
}
