package com.carol;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: Carol Tang
 * @Version: 1.0.0
 * @Date: 2018-09-10 16:45
 * @Description: 定义一个feign接口
 **/
@FeignClient(value = "eureka-client",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam("name") String name);
}
