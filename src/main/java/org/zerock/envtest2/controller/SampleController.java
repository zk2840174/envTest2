package org.zerock.envtest2.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {



    @Value("${org.zerock.V1}")
    private String v1;

    @Value("${org.zerock.V2}")
    private String v2;


    @GetMapping("/hello")
    public String[] hello() {

        return new String[] { v1, v2 };


    }

}
