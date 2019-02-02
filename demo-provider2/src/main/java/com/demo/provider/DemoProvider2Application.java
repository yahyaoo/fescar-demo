package com.demo.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Title: DemoProvider2Application
 * Description:  TODO (这里用一句话描述这个类的作用)
 *
 * @author yuhong
 * @Company com.jdschool
 * @date 2019/2/1 23:14
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan(basePackages = "com.demo.provider.mapper")
@EnableTransactionManagement
public class DemoProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoProvider2Application.class, args);
    }

}

