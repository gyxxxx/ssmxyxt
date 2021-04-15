package com.entity;

public class Yifusonghui {
    private Integer id;
	private String bianhao;	private String xiyifangfa;	private String yifuleixing;	private String jiage;	private String huoguibianhao;	private String xiadanren;	
    private String addtime;

    

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
	
	public String getBianhao() {
        return bianhao;
    }
    public void setBianhao(String bianhao) {
        this.bianhao = bianhao == null ? null : bianhao.trim();
    }	public String getXiyifangfa() {
        return xiyifangfa;
    }
    public void setXiyifangfa(String xiyifangfa) {
        this.xiyifangfa = xiyifangfa == null ? null : xiyifangfa.trim();
    }	public String getYifuleixing() {
        return yifuleixing;
    }
    public void setYifuleixing(String yifuleixing) {
        this.yifuleixing = yifuleixing == null ? null : yifuleixing.trim();
    }	public String getJiage() {
        return jiage;
    }
    public void setJiage(String jiage) {
        this.jiage = jiage == null ? null : jiage.trim();
    }	public String getHuoguibianhao() {
        return huoguibianhao;
    }
    public void setHuoguibianhao(String huoguibianhao) {
        this.huoguibianhao = huoguibianhao == null ? null : huoguibianhao.trim();
    }	public String getXiadanren() {
        return xiadanren;
    }
    public void setXiadanren(String xiadanren) {
        this.xiadanren = xiadanren == null ? null : xiadanren.trim();
    }	
	
	
    public String getAddtime() {
        return addtime;
    }
    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }
}
//   设置字段信息
