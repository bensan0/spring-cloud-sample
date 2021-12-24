package com.example.feign.handlers;

import com.example.feign.providers.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/feign")
@RestController
public class FeignProviderHandler {

    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("hello")
    public String feignHello(){
        return feignProviderClient.providerHello();
    }

}
