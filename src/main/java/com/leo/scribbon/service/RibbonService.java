package com.leo.scribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.leo.scribbon.RestResponse;

/**
 * Created by leo on 2018/1/18.
 * Description:
 */
@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;

    public String requestEurekaClient() {
        ResponseEntity<RestResponse> responseEntity = restTemplate.getForEntity("http://eureka-client1/test/test-string", RestResponse.class);
        return responseEntity.getBody().getData().toString();
    }
}
