package com.example.feign.providers;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "sample-eureka-client")
public interface FeignProviderClient {

    @GetMapping("hello")
    String providerHello();
}
