package com.BonumUrsus.AroundAdvice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.BonumUrsus.AroundAdvice")
public class DemoConfig {
}
