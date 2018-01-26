package com.leo.scribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.leo.scribbon.RestResponse;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * Created by leo on 2018/1/18.
 * Description:
 */
@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    public RestResponse requestEurekaClient() {
        ResponseEntity<RestResponse> responseEntity = restTemplate.getForEntity("http://EUREKA-CLIENT1/test", RestResponse.class);
        return responseEntity.getBody();
    }

    public RestResponse error() {
        return new RestResponse<>(400, "接口暂不可用", null);
    }
}
