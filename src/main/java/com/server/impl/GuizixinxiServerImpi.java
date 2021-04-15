package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.GuizixinxiMapper;
import com.entity.Guizixinxi;
import com.server.GuizixinxiServer;
@Service
public class GuizixinxiServerImpi implements GuizixinxiServer {
   @Resource
   private GuizixinxiMapper gdao;
	@Override
	public int add(Guizixinxi po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Guizixinxi po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Guizixinxi> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Guizixinxi> getsyguizixinxi1(Map<String, Object> map) {
		return gdao.getsyguizixinxi1(map);
	}
	public List<Guizixinxi> getsyguizixinxi2(Map<String, Object> map) {
		return gdao.getsyguizixinxi2(map);
	}
	public List<Guizixinxi> getsyguizixinxi3(Map<String, Object> map) {
		return gdao.getsyguizixinxi3(map);
	}
	
	@Override
	public Guizixinxi quchongGuizixinxi(Map<String, Object> account) {
		return gdao.quchongGuizixinxi(account);
	}

	@Override
	public List<Guizixinxi> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Guizixinxi> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Guizixinxi getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

