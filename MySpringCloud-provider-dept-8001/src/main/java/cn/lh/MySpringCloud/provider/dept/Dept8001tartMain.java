package cn.lh.MySpringCloud.provider.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ImportResource;
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Dept8001tartMain {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Dept8001tartMain.class, args);
	}
}
