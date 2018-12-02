package com.cafebabe.cloud.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * <b>Description:</b><br> : { describe your functions }
 *
 * @author : suchao@renrenche.com
 * @version : 1.0
 * @Note <b>ProjectName:</b> cafebabe-cloud
 * <br><b>PackageName:</b> com.cafebabe.cloud.provider.controller
 * <br><b>Date:</b> 2018/12/1 下午11:40
 */
@RestController
@RequestMapping("/v2")
public class V2Controller {

    @Value("${server.port}")
    public int serverPort;

    @GetMapping("/get/name")
    public String getName(){
        return "v2"+ serverPort;
    }

}
