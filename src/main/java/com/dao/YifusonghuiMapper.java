package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Yifusonghui;

public interface YifusonghuiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Yifusonghui record);

    int insertSelective(Yifusonghui record);

    Yifusonghui selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Yifusonghui record);
	
    int updateByPrimaryKey(Yifusonghui record);
	public Yifusonghui quchongYifusonghui(Map<String, Object> bianhao);
	public List<Yifusonghui> getAll(Map<String, Object> map);
	public List<Yifusonghui> getsyyifusonghui1(Map<String, Object> map);
	public List<Yifusonghui> getsyyifusonghui3(Map<String, Object> map);
	public List<Yifusonghui> getsyyifusonghui2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Yifusonghui> getByPage(Map<String, Object> map);
	public List<Yifusonghui> select(Map<String, Object> map);
//	所有List
}

