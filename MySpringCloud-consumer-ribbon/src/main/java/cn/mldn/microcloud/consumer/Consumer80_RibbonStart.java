package cn.mldn.microcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication 
@EnableEurekaClient
public class Consumer80_RibbonStart {
	public static void main(String[] args) {
		SpringApplication.run(Consumer80_RibbonStart.class, args);
	}
}
