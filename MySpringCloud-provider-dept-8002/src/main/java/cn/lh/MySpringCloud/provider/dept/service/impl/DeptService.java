package cn.lh.MySpringCloud.provider.dept.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.lh.MySpringCloud.api.service.IDeptService;
import cn.lh.MySpringCloud.api.vo.Dept;
import cn.lh.MySpringCloud.provider.dept.dao.IDeptDAO;
@Service
public class DeptService implements IDeptService{
	@Resource
	private IDeptDAO deptDAO;

	@Override
	public boolean add(Dept dept) {
		return this.deptDAO.doCreate(dept);
	}
	@Override
	public Dept get(Long deptno) {
		return this.deptDAO.findById(deptno);
	}

	@Override
	public List<Dept> list() {
		return this.deptDAO.findAll();
	}

}
