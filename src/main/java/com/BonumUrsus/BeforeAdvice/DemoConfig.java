package com.BonumUrsus.BeforeAdvice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.BonumUrsus.BeforeAdvice")
public class DemoConfig {
}
