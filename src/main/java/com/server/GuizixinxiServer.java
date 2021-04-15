package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Guizixinxi;

public interface GuizixinxiServer {

  public int add(Guizixinxi po);

  public int update(Guizixinxi po);
  
  
  
  public int delete(int id);

  public List<Guizixinxi> getAll(Map<String,Object> map);
  public List<Guizixinxi> getsyguizixinxi1(Map<String,Object> map);
  public List<Guizixinxi> getsyguizixinxi2(Map<String,Object> map);
  public List<Guizixinxi> getsyguizixinxi3(Map<String,Object> map);
  public Guizixinxi quchongGuizixinxi(Map<String, Object> acount);

  public Guizixinxi getById( int id);

  public List<Guizixinxi> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Guizixinxi> select(Map<String, Object> map);
}
//	所有List
