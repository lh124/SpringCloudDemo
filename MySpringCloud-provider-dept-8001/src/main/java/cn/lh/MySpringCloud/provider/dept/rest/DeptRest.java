package cn.lh.MySpringCloud.provider.dept.rest;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.lh.MySpringCloud.api.service.IDeptService;
import cn.lh.MySpringCloud.api.vo.Dept;

@RestController
public class DeptRest {
	@Resource
	private IDeptService deptService;
//	访问地址http://dept-8001.com:8001/dept/list
	@RequestMapping("/dept/list")
	public Object list() {
		return this.deptService.list();
	}
//	访问地址http://dept-8001.com:8001/dept/get?deptno=1
	@RequestMapping("/dept/get")
	public Object get(Long deptno) {
		return this.deptService.get(deptno);
	}
//	访问地址http://dept-8001.com:8001/dept/add?dname=11&loc=11
	@RequestMapping("/dept/add")
	public Object add(Dept dept) {
		return this.deptService.add(dept);
	}
}
