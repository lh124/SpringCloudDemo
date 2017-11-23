package cn.lh.MySpringCloud.api.service;

import java.util.List;

import cn.lh.MySpringCloud.api.vo.Dept;

public interface IDeptService {

	public boolean add(Dept dept);
	public Dept get(Long deptno);
	public List<Dept> list();
}
