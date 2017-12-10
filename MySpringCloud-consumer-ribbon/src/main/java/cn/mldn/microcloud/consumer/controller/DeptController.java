package cn.mldn.microcloud.consumer.controller;

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
	public static final String DEPT_ADD_URL = "http://MYSPRINGCLOUD-PROVIDER-DEPT/dept/add";
	public static final String DEPT_GET_URL = "http://MYSPRINGCLOUD-PROVIDER-DEPT/dept/get";
	public static final String DEPT_LIST_URL = "http://MYSPRINGCLOUD-PROVIDER-DEPT/dept/list";
	@Resource
	private RestTemplate restTemplate;
	@Resource
	private HttpHeaders headers; // 有认证信息

	@GetMapping("/consumer/dept/list")
	public Object listDeptRest() {
		List<Dept> allDepts = this.restTemplate
				.exchange(DEPT_LIST_URL, HttpMethod.GET, new HttpEntity<Object>(this.headers), List.class).getBody();
		return allDepts;
	}

	@GetMapping("/consumer/dept/get")
	public Object getDeptRest(long deptno) {
		Dept dept = this.restTemplate
				.exchange(DEPT_GET_URL + "/" + deptno, HttpMethod.GET, new HttpEntity<Object>(this.headers), Dept.class)
				.getBody();
		return dept;
	}

	@GetMapping("/consumer/dept/add")
	public boolean addDeptRest(Dept dept) {
		Boolean flag = this.restTemplate
				.exchange(DEPT_ADD_URL, HttpMethod.POST, new HttpEntity<Object>(dept, this.headers), Boolean.class)
				.getBody();
		return flag;
	}
}
