package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.YifusonghuiMapper;
import com.entity.Yifusonghui;
import com.server.YifusonghuiServer;
@Service
public class YifusonghuiServerImpi implements YifusonghuiServer {
   @Resource
   private YifusonghuiMapper gdao;
	@Override
	public int add(Yifusonghui po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Yifusonghui po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Yifusonghui> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Yifusonghui> getsyyifusonghui1(Map<String, Object> map) {
		return gdao.getsyyifusonghui1(map);
	}
	public List<Yifusonghui> getsyyifusonghui2(Map<String, Object> map) {
		return gdao.getsyyifusonghui2(map);
	}
	public List<Yifusonghui> getsyyifusonghui3(Map<String, Object> map) {
		return gdao.getsyyifusonghui3(map);
	}
	
	@Override
	public Yifusonghui quchongYifusonghui(Map<String, Object> account) {
		return gdao.quchongYifusonghui(account);
	}

	@Override
	public List<Yifusonghui> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Yifusonghui> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Yifusonghui getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

