package com.entity;

public class Guizixinxi {
    private Integer id;
	private String huoguibianhao;	private String guige;	private String weizhi;	
    private String addtime;

    

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
	
	public String getHuoguibianhao() {
        return huoguibianhao;
    }
    public void setHuoguibianhao(String huoguibianhao) {
        this.huoguibianhao = huoguibianhao == null ? null : huoguibianhao.trim();
    }	public String getGuige() {
        return guige;
    }
    public void setGuige(String guige) {
        this.guige = guige == null ? null : guige.trim();
    }	public String getWeizhi() {
        return weizhi;
    }
    public void setWeizhi(String weizhi) {
        this.weizhi = weizhi == null ? null : weizhi.trim();
    }	
	
	
    public String getAddtime() {
        return addtime;
    }
    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }
}
//   设置字段信息
