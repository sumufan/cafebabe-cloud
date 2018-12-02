package com.cafebabe.cloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <b>Description:</b><br> : 服务提供端
 *
 * @author : suchao@renrenche.com
 * @version : 1.0
 * @Note <b>ProjectName:</b> cafebabe-cloud
 * <br><b>PackageName:</b> com.cafebabe.cloud.provider
 * <br><b>Date:</b> 2018/12/1 下午11:35
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
