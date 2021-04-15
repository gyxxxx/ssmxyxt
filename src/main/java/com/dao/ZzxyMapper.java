package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Zzxy;

public interface ZzxyMapper {
	
	public List<Zzxy> getAll(Map<String, Object> map);

	public Zzxy getById(int id);

}
