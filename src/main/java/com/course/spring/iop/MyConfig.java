package com.course.spring.iop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.course.spring.iop")
@EnableAspectJAutoProxy
public class MyConfig {
}
