package com.ravi.sparkspring.poc.configuration;

import org.apache.spark.SparkConf;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

	@Bean
	public SparkConf sparkConf() {
		return new SparkConf(false);
	}
}
