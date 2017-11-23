package cn.lh.MySpringCloud.provider.dept.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
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
	@Resource
	private HttpHeaders headers;
//	访问地址 http://localhost/consumer/dept/add?dname=12&loc=13
	@GetMapping("/consumer/dept/add")
	public Object addRest(Dept dept) {
//		Boolean postForObject = this.restTemplate.postForObject(DEPT_ADD_URL, dept, Boolean.class);
		Boolean flag = this.restTemplate.exchange(DEPT_ADD_URL, HttpMethod.POST, new HttpEntity<Object>(this.headers), Boolean.class).getBody();
		return flag;
	}
//	访问地址 http://localhost/consumer/dept/list
	@SuppressWarnings("unchecked")
	@GetMapping("/consumer/dept/list")
	public Object listRest() {
//		List<Dept> forObject = this.restTemplate.getForObject(DEPT_LIST_URL, List.class);
		List<Dept> list = this.restTemplate.exchange(DEPT_LIST_URL, HttpMethod.GET, new HttpEntity<Object>(this.headers), List.class).getBody();
		return list;
	}
//	访问地址 http://localhost/consumer/dept/gets?deptno=1
	@GetMapping("/consumer/dept/get")
	public Object getRest(Long deptno) {
//		Dept dept = this.restTemplate.getForObject(DEPT_GET_URL+"/"+deptno, Dept.class);
		Dept dept = this.restTemplate.exchange(DEPT_GET_URL+"/"+deptno, HttpMethod.GET, new HttpEntity<Object>(this.headers), Dept.class).getBody();
		return dept;
	}
}
