package com.cafebabe.cloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * <b>Description:</b><br> : zuul application
 *
 * @author : suchao@renrenche.com
 * @version : 1.0
 * @Note <b>ProjectName:</b> cafebabe-cloud
 * <br><b>PackageName:</b> com.cafebabe.cloud.zuul
 * <br><b>Date:</b> 2018/12/1 下午10:51
 */
@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
