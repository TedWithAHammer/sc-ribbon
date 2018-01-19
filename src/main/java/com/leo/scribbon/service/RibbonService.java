package com.leo.scribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
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
//        ParameterizedTypeReference<RestResponse<String>> typeRef = new ParameterizedTypeReference<RestResponse<String>>() {
//        };
//        ResponseEntity<RestResponse<String>> responseEntity = restTemplate.exchange("http://EUREKA-CLIENT1/test", HttpMethod.GET, null, typeRef);
//        return responseEntity.getBody().getData();

        ResponseEntity<RestResponse> responseEntity = restTemplate.getForEntity("http://EUREKA-CLIENT1/test", RestResponse.class);
        return responseEntity.getBody().getData().toString();
    }
}
