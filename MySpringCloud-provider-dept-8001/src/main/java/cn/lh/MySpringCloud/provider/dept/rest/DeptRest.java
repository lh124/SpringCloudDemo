package cn.lh.MySpringCloud.provider.dept.rest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.lh.MySpringCloud.api.service.IDeptService;
import cn.lh.MySpringCloud.api.vo.Dept;

@RestController
public class DeptRest {
	@Resource
	private IDeptService deptService;
	@Resource
	private DiscoveryClient client;
//	访问地址http://dept-8001.com:8001/dept/list
//	配置安全访问后的地址：http://dept-8001.com:8001/dept/list
	@GetMapping("/dept/list")
	public Object list() {
		return this.deptService.list();
	}
//	访问地址http://dept-8001.com:8001/dept/get?deptno=1
//	配置安全访问后的地址： http://dept-8001.com:8001/dept/get?deptno=1
	@GetMapping("/dept/get/{deptno}")
	public Object get(@PathVariable("deptno") Long deptno) {
		return this.deptService.get(deptno);
	}
//	访问地址http://dept-8001.com:8001/dept/add?dname=11&loc=11
//	配置安全访问后的地址：http://dept-8001.com:8001/dept/add?dname=11&loc=11
	@PostMapping("/dept/add")
	public Object add(@RequestBody Dept dept) {
		return this.deptService.add(dept);
	}
	
	@GetMapping("/dept/sessionid")
	public Object sessionId(HttpServletRequest request) {
		return request.getSession().getId();
	}
	@GetMapping("/dept/discover")
	public Object discover() {
		return this.client;
	}
}
