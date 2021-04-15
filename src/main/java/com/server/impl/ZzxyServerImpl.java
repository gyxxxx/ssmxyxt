package com.server.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.ZzxyMapper;
import com.entity.Xiyixinxi;
import com.entity.Zzxy;
import com.server.ZzxyServer;
@Service
public class ZzxyServerImpl implements ZzxyServer{
	
	@Resource
	private ZzxyMapper zzxyMapper;

	@Override
	public List<Zzxy> getAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return zzxyMapper.getAll(map);
	}

	@Override
	public Zzxy getById(int id) {
		// TODO Auto-generated method stub
		return zzxyMapper.getById(id);
	}
}
