package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Xiyixinxi;

public interface XiyixinxiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Xiyixinxi record);

    int insertSelective(Xiyixinxi record);

    Xiyixinxi selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Xiyixinxi record);
	
    int updateByPrimaryKey(Xiyixinxi record);
	public Xiyixinxi quchongXiyixinxi(Map<String, Object> bianhao);
	public List<Xiyixinxi> getAll(Map<String, Object> map);
	public List<Xiyixinxi> getsyxiyixinxi1(Map<String, Object> map);
	public List<Xiyixinxi> getsyxiyixinxi3(Map<String, Object> map);
	public List<Xiyixinxi> getsyxiyixinxi2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Xiyixinxi> getByPage(Map<String, Object> map);
	public List<Xiyixinxi> select(Map<String, Object> map);
//	所有List
}

