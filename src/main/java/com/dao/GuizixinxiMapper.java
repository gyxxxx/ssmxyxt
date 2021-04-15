package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Guizixinxi;

public interface GuizixinxiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Guizixinxi record);

    int insertSelective(Guizixinxi record);

    Guizixinxi selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Guizixinxi record);
	
    int updateByPrimaryKey(Guizixinxi record);
	public Guizixinxi quchongGuizixinxi(Map<String, Object> huoguibianhao);
	public List<Guizixinxi> getAll(Map<String, Object> map);
	public List<Guizixinxi> getsyguizixinxi1(Map<String, Object> map);
	public List<Guizixinxi> getsyguizixinxi3(Map<String, Object> map);
	public List<Guizixinxi> getsyguizixinxi2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Guizixinxi> getByPage(Map<String, Object> map);
	public List<Guizixinxi> select(Map<String, Object> map);
//	所有List
}

