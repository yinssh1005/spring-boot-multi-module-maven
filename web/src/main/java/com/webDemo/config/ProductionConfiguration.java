package com.webDemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("hsqldb")
public class ProductionConfiguration {
}
