package com.test.module;

import cn.dev33.satoken.SaManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.test" })
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        // System.out.println("启动成功");
        System.out.println("启动成功，Sa-Token 配置如下：" + SaManager.getConfig());
    }
}
