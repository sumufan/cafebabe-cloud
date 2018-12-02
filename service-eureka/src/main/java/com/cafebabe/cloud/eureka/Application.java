package com.cafebabe.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <b>Description:</b><br> : springboot启动
 *
 * @author : suchao@renrenche.com
 * @version : 1.0
 * @Note <b>ProjectName:</b> cafebabe-cloud
 * <br><b>PackageName:</b> com.cafebabe.cloud.eureka
 * <br><b>Date:</b> 2018/12/1 下午8:46
 */
@EnableEurekaServer
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}
