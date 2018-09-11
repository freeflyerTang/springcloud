package com.carol;

import org.springframework.stereotype.Component;

/**
 * @Author: Carol Tang
 * @Version: 1.0.0
 * @Date: 2018-09-10 17:22
 * @Description: 断路器实现
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry,error "+name;
    }
}
