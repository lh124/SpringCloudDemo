package cn.lh.MySpringCloud.provider.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekastartMain {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekastartMain.class, args);
	}
}
