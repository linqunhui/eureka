package cn.udrm.soa.eureka.eureka_client.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTestController {


    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
    	return "hi " + name + ",i am from port:2001";
    }

}