package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Yifusonghui;

public interface YifusonghuiServer {

  public int add(Yifusonghui po);

  public int update(Yifusonghui po);
  
  
  
  public int delete(int id);

  public List<Yifusonghui> getAll(Map<String,Object> map);
  public List<Yifusonghui> getsyyifusonghui1(Map<String,Object> map);
  public List<Yifusonghui> getsyyifusonghui2(Map<String,Object> map);
  public List<Yifusonghui> getsyyifusonghui3(Map<String,Object> map);
  public Yifusonghui quchongYifusonghui(Map<String, Object> acount);

  public Yifusonghui getById( int id);

  public List<Yifusonghui> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Yifusonghui> select(Map<String, Object> map);
}
//	所有List
