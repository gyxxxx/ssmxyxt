package com.entity;

public class Xiyixinxi {
    private Integer id;
	private String bianhao;
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
    }
        return xiyifangfa;
    }
    public void setXiyifangfa(String xiyifangfa) {
        this.xiyifangfa = xiyifangfa == null ? null : xiyifangfa.trim();
    }
        return yifuleixing;
    }
    public void setYifuleixing(String yifuleixing) {
        this.yifuleixing = yifuleixing == null ? null : yifuleixing.trim();
    }
        return zhuyineirong;
    }
    public void setZhuyineirong(String zhuyineirong) {
        this.zhuyineirong = zhuyineirong == null ? null : zhuyineirong.trim();
    }
        return jiage;
    }
    public void setJiage(String jiage) {
        this.jiage = jiage == null ? null : jiage.trim();
    }
        return beizhu;
    }
    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }
	
	
    public String getAddtime() {
        return addtime;
    }
    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }
	@Override
	public String toString() {
		return "Xiyixinxi [id=" + id + ", bianhao=" + bianhao + ", xiyifangfa=" + xiyifangfa + ", yifuleixing="
				+ yifuleixing + ", zhuyineirong=" + zhuyineirong + ", jiage=" + jiage + ", beizhu=" + beizhu
				+ ", addtime=" + addtime + "]";
	}
}
//   设置字段信息