package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.XiyixinxiMapper;
import com.entity.Xiyixinxi;
import com.server.XiyixinxiServer;
@Service
public class XiyixinxiServerImpi implements XiyixinxiServer {
   @Resource
   private XiyixinxiMapper gdao;
	@Override
	public int add(Xiyixinxi po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Xiyixinxi po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Xiyixinxi> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Xiyixinxi> getsyxiyixinxi1(Map<String, Object> map) {
		return gdao.getsyxiyixinxi1(map);
	}
	public List<Xiyixinxi> getsyxiyixinxi2(Map<String, Object> map) {
		return gdao.getsyxiyixinxi2(map);
	}
	public List<Xiyixinxi> getsyxiyixinxi3(Map<String, Object> map) {
		return gdao.getsyxiyixinxi3(map);
	}
	
	@Override
	public Xiyixinxi quchongXiyixinxi(Map<String, Object> account) {
		return gdao.quchongXiyixinxi(account);
	}

	@Override
	public List<Xiyixinxi> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Xiyixinxi> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Xiyixinxi getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

