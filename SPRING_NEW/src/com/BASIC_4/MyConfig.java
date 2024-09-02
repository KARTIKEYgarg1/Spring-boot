package com.BASIC_4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.BASIC_4")
@PropertySource("classpath:data.properties")
public class MyConfig {
}
