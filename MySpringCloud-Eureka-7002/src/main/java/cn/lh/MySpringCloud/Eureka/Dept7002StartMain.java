package cn.lh.MySpringCloud.Eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@SpringBootApplication
@EnableEurekaServer
public class Dept7002StartMain {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Dept7002StartMain.class, args);
	}
}
