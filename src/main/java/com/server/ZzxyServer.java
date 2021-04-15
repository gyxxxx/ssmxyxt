package com.server;

import java.util.List;
import java.util.Map;

import com.entity.Zzxy;

public interface  ZzxyServer {
	
	public List<Zzxy> getAll(Map<String, Object> map);

	public Zzxy getById(int id);
}
