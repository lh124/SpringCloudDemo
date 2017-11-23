package cn.lh.MySpringCloud.provider.dept.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cn.lh.MySpringCloud.api.vo.Dept;

@RestController
public class DeptController {
	private static final String DEPT_ADD_URL="http://dept-8001.com:8001/dept/add";
	private static final String DEPT_LIST_URL="http://dept-8001.com:8001/dept/list";
	private static final String DEPT_GET_URL="http://dept-8001.com:8001/dept/get";
	@Resource
	private RestTemplate restTemplate;
	@GetMapping("/consumer/dept/add")
	public Object add(Dept dept) {
		Boolean postForObject = this.restTemplate.postForObject(DEPT_ADD_URL, dept, Boolean.class);
		return postForObject;
	}
	@SuppressWarnings("unchecked")
	@GetMapping("/consumer/dept/list")
	public Object list() {
		List<Dept> forObject = this.restTemplate.getForObject(DEPT_LIST_URL, List.class);
		return forObject;
	}
	@GetMapping("/consumer/dept/get")
	public Object get(Long deptno) {
		Dept forObject = this.restTemplate.getForObject(DEPT_GET_URL, Dept.class);
		return forObject;
	}
}
