package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudLogApplication implements CommandLineRunner {

	private static Logger logger = LoggerFactory.getLogger(SpringCloudLogApplication.class);

	public static void main(String[] args) {
		logger.debug("######## SpringCloudLogApplication应用启动开始 ########");
		SpringApplication.run(SpringCloudLogApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.debug("######## SpringCloudLogApplication应用启动完成 ########");
	}
}
