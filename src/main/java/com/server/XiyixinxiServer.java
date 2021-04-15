package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Xiyixinxi;

public interface XiyixinxiServer {

  public int add(Xiyixinxi po);

  public int update(Xiyixinxi po);
  
  
  
  public int delete(int id);

  public List<Xiyixinxi> getAll(Map<String,Object> map);
  public List<Xiyixinxi> getsyxiyixinxi1(Map<String,Object> map);
  public List<Xiyixinxi> getsyxiyixinxi2(Map<String,Object> map);
  public List<Xiyixinxi> getsyxiyixinxi3(Map<String,Object> map);
  public Xiyixinxi quchongXiyixinxi(Map<String, Object> acount);

  public Xiyixinxi getById( int id);

  public List<Xiyixinxi> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Xiyixinxi> select(Map<String, Object> map);
}
//	所有List
